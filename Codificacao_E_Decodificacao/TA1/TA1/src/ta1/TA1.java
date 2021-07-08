package ta1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import codificacoes.TipoDeCodificacao;
import codificacoes.Decoder;
import codificacoes.Encoder;
import codificacoes.delta.Delta;
import codificacoes.eliasGamma.EliasGamma;
import codificacoes.fibonacci.Fibonacci;
import codificacoes.golomb.Golomb;
import codificacoes.unaria.Unary;

import static codificacoes.TipoDeCodificacao.*;

public class TA1 {

    public static void main(String[] args) {
        boolean isOn = true;

        while (isOn) {
            // página inicial (0-codificar 1-decodificar)
            Object[] functions = {"Codificar", "Decodificar"};
            int op = JOptionPane.showOptionDialog(null, "Escolha a função: ", "Teoria da Informação - TA 1",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, functions, functions[0]);

            if (op == -1) {
                Object[] options = {"Encerrar programa", "Voltar"};
                int end = JOptionPane.showOptionDialog(null, "Deseja encerrar o programa?", "Teoria da Informação - TA 1",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                if (end == 0) {
                    isOn = false;
                    break;
                } else {
                    continue;
                }
            }

            // arquivos
            final JFileChooser fileChooser = new JFileChooser();
            fileChooser.setMultiSelectionEnabled(false);
            fileChooser.setCurrentDirectory(new java.io.File("./arquivos"));
            if (op == 1) {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.cod", "cod");
                fileChooser.setFileFilter(filter);
                fileChooser.addChoosableFileFilter(filter);
            }
            File selectedFile = null;
            int retVal = fileChooser.showOpenDialog(null);
            if (retVal == JFileChooser.APPROVE_OPTION) {
                if (op == 1) {
                    while (retVal == JFileChooser.APPROVE_OPTION && !fileChooser.getSelectedFile().getName().endsWith(".cod")) {
                        JOptionPane.showMessageDialog(null, "O arquivo "
                                        + fileChooser.getSelectedFile().getName() + " não é um arquivo codificado!",
                                "Teoria da Informação - TA 1", JOptionPane.ERROR_MESSAGE);
                        retVal = fileChooser.showOpenDialog(null);
                    }
                }
                selectedFile = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(null, selectedFile.getName());
            }

            if (retVal == 1) {
                continue;
            }

            if (op == 1) {
                try {
                    Decoder decoder = null;
                    byte[] data = Files.readAllBytes(selectedFile.toPath());
                    switch (data[0]) {
                        case 0:
                            decoder = new Golomb(data[1]);
                            break;

                        case 1:
                            decoder = new EliasGamma();
                            break;

                        case 2:
                            decoder = new Fibonacci();
                            break;

                        case 3:
                            decoder = new Unary();
                            break;

                        case 4:
                            decoder = new Delta();
                            break;

                        default:
                            break;
                    }

                    if (decoder != null) {
                        byte[] result = decoder.decode(data);
                        final String ext = ".dec";
                        String filePath = selectedFile.getPath();
                        int extIndex = filePath.lastIndexOf(".");
                        String newPath = (extIndex > -1 ? filePath.substring(0, extIndex) : filePath) + ext;
                        Files.write(Paths.get(newPath), result);
                        JOptionPane.showMessageDialog(null, "Decodificação concluída com sucesso!");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                // escolher codificador (0: Golomb, 1:Elias-Gamma, 2:Fibonacci, 3:Unária e 4:Delta)
                Object[] items = {Golomb.getNome(), EliasGamma.getNome(), Fibonacci.getNome(), Unary.getNome(), Delta.getNome()};
                Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um codificador: ", "Teoria da Informação - TA 1",
                        JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);

                if (selectedValue == null) {
                    continue;
                } else {
                    final TipoDeCodificacao selectedCodingType = getValueByName((String) selectedValue);
                    Encoder encoder = null;

                    switch (selectedCodingType) {
                        case Golomb:
                            boolean invalidDivisor = true;
                            String inputValue = null;

                            while (invalidDivisor) {
                                inputValue = JOptionPane.showInputDialog("Insira o valor do divisor: (Entre 1 e 255)");

                                if (inputValue == null) {
                                    break;
                                }

                                try {
                                    int divisor = Integer.parseInt(inputValue);
                                    encoder = new Golomb(divisor);
                                    if(divisor > 0 && divisor < 256) {
                                        invalidDivisor = false;
                                    }
                                } catch (Exception e) {
                                    // e.printStackTrace();
                                }
                            }

                            if (inputValue == null) {
                                continue;
                            }
                            break;
                        case EliasGamma:
                            encoder = new EliasGamma();
                            break;
                        case Fibonacci:
                            encoder = new Fibonacci();
                            break;
                        case Unary:
                            encoder = new Unary();
                            break;
                        case Delta:
                            encoder = new Delta();
                            break;
                    }

                    try {
                        byte[] data = Files.readAllBytes(selectedFile.toPath());
                        byte[] result = encoder.encode(data);
                        final String ext = ".cod";
                        String filePath = selectedFile.getPath();
                        int extIndex = filePath.lastIndexOf(".");
                        String newPath = (extIndex > -1 ? filePath.substring(0, extIndex) : filePath) + ext;
                        Files.write(Paths.get(newPath), result);
                        JOptionPane.showMessageDialog(null, "Codificação concluída com sucesso!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.exit(0);
    }
}
