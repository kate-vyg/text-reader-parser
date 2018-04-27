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
    private TextArea textView;

    @FXML
    private TextArea listView;

    private FileChooser fileChooser = new FileChooser();

    @FXML
    void handleButtonAction(ActionEvent event) {

        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            String content = TextUtils.readAsString(Paths.get(selectedFile.getPath()));
            textView.setText(content);
            textView.setWrapText(true);

            Map<String, Integer> map = FrequencyCalculator.countWords(content);
            map = FrequencyCalculator.sortDescendingly(map);
            listView.setText(map.toString());
            listView.setWrapText(true);
        }
    }
}
