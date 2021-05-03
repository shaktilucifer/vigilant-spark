import org.hexworks.zircon.api.CP437TilesetResources;
import org.hexworks.zircon.api.DrawSurfaces;
import org.hexworks.zircon.api.GraphicalTilesetResources;
import org.hexworks.zircon.api.SwingApplications;
import org.hexworks.zircon.api.application.AppConfig;
import org.hexworks.zircon.api.color.ANSITileColor;
import org.hexworks.zircon.api.color.TileColor;
import org.hexworks.zircon.api.data.Position;
import org.hexworks.zircon.api.data.Tile;
import org.hexworks.zircon.api.graphics.Layer;
import org.hexworks.zircon.api.graphics.Symbols;
import org.hexworks.zircon.api.graphics.TileGraphics;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.screen.Screen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class App {

    public static void main(String[] args) {

        TileGrid tileGrid = SwingApplications
                .startTileGrid(
                        AppConfig.newBuilder()
                                .withSize(50, 50)
//                                .withDefaultTileset(CP437TilesetResources.anikki16x16())
                                .withDefaultGraphicalTileset(GraphicalTilesetResources.nethack16x16())
//                                .withDebugMode(true)
                                .build()
                );

        final Screen screen = Screen.create(tileGrid);
//        List<Layer> layers = GraphicalTilesetResources.nethack16x16().get;
        screen.display();
        final TileGraphics background = DrawSurfaces.tileGraphicsBuilder()
                .withSize(tileGrid.getSize()) // you can fetch the size of a TileGrid like this
                .withFiller(Tile.newBuilder()
//                        .withCharacter(Symbols.BULLET)
                        .withBackgroundColor(ANSITileColor.WHITE)
                        .withForegroundColor(ANSITileColor.CYAN)
                        .build())
                .build();
        tileGrid.draw(background, Position.zero());
        tileGrid.draw(
                Tile.newBuilder()
                        .buildGraphicalTile()
                        .withName("Giant ant")
                        .withTags(new HashSet<>(Arrays.asList("animal", "ant", "giant")))
                        .withName("Pyrolisk")
                        .withForegroundColor(ANSITileColor.MAGENTA)
                        .toBuilder().build(), Position.create(2, 5)
        );


    }

}
