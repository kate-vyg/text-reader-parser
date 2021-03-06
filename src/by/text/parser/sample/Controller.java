package by.text.parser.sample;

import by.text.parser.util.FrequencyCalculator;
import by.text.parser.util.TextUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;
import java.nio.file.Paths;
import java.util.Map;

public class Controller {

    @FXML
    private Button selectFileButton;

    @FXML
    private TextArea readText;

    @FXML
    private TextArea frequencyCalculator;

    private FileChooser fileChooser = new FileChooser();

    @FXML
    void handleButtonAction(ActionEvent event) {

        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            String content = TextUtils.readAsString(Paths.get(selectedFile.getPath()));
            readText.setText(content);
            readText.setWrapText(true);

            Map<String, Integer> map = FrequencyCalculator.countWords(content);
            map = FrequencyCalculator.sortDescendingly(map);
            frequencyCalculator.setText(map.toString());
            frequencyCalculator.setWrapText(true);
        }
    }
}
