package co.lima.andreza;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UIMain {

    public static void main(String[] args) {
        final var gameConfig = Stream.of(args)
                .collect(toMap(k -> k.split(";")[0], v -> v.split(";")[1]));
        var mainsScreen = new co.lima.andreza.ui.custom.screen.MainScreen(gameConfig);
        mainsScreen.buildMainScreen();
    }
}
