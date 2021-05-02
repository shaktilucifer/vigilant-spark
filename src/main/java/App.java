import org.hexworks.zircon.api.CP437TilesetResources;
import org.hexworks.zircon.api.SwingApplications;
import org.hexworks.zircon.api.application.AppConfig;
import org.hexworks.zircon.api.color.ANSITileColor;
import org.hexworks.zircon.api.data.Position;
import org.hexworks.zircon.api.data.Tile;
import org.hexworks.zircon.api.grid.TileGrid;

public class App {

    public static void main(String[] args) {

        TileGrid tileGrid = SwingApplications
                .startTileGrid(
                        AppConfig.newBuilder()
                                .withSize(50, 50)
                                .withDefaultTileset(CP437TilesetResources.wanderlust16x16())
                                .build()
                );
        tileGrid.draw(
                Tile.newBuilder()
                        .buildCharacterTile().withCharacter('@')
                        .withBackgroundColor(ANSITileColor.BRIGHT_WHITE)
                        .withForegroundColor(ANSITileColor.BRIGHT_CYAN)
                        .toBuilder().build(), Position.create(2, 3)
        );

    }

}
