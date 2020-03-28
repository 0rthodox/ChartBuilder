
import javafx.util.Pair;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LineChartModel {


    public List<Pair<? extends Number, ? extends Number>> readData(File file) throws IOException {
        final List<String> lines = FileUtils.readAll(file);
        return lines.stream().map(line -> {
            String[] splitted = line.split(",");
            return new Pair<>(Integer.valueOf(splitted[0]), Integer.valueOf(splitted[1]));
        }).collect(Collectors.toList());
    }

    public List<Pair<? extends Number, ? extends Number>> readData2(File file) throws IOException {
        final List<String> lines = FileUtils.readAll(file);
        final List<Pair<? extends Number, ? extends Number>> pairs = new ArrayList<>();

        lines.forEach(line -> {
            String[] splitted = line.split(" ");
            pairs.add(new Pair<>(Integer.valueOf(splitted[0]), Integer.valueOf(splitted[1])));
        });

        return pairs;
    }
}
