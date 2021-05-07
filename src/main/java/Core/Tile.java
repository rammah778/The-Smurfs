package Core;

import javax.swing.*;

public class Tile extends JButton implements Comparable<Tile> {
    private boolean hasGold;
    private boolean hasMushroom;
    private boolean isWall;
    private boolean hasEnemy;
    private int distance = -1; // ~= infinity
    private Tile previous;
    private Location tileLocation;
    private int paths = 0; // number of paths that cross this tile

    public Tile() {
    }

    public boolean HasGold() {
        return hasGold;
    }

    public void setHasGold(boolean hasGold) {
        this.hasGold = hasGold;
    }

    public boolean HasMushroom() {
        return hasMushroom;
    }

    public void setHasMushroom(boolean hasMushroom) {
        this.hasMushroom = hasMushroom;
    }

    public boolean isNotWall() {
        return !isWall;
    }

    public void setIsWall(boolean wall) {
        isWall = wall;
    }
    public boolean HasEnemy() {
        return hasEnemy;
    }

    public void setHasEnemy(boolean hasEnemy) {
        this.hasEnemy = hasEnemy;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Tile getPrevious() {
        return previous;
    }

    public void setPrevious(Tile previous) {
        this.previous = previous;
    }

    public Location getTileLocation() {
        return tileLocation;
    }

    public void setTileLocation(Location location) {
        this.tileLocation = location;
    }

    public int getPaths() {
        return paths;
    }

    public void setPaths(int paths) {
        this.paths = paths;
    }

    public void incrementPaths() {
        paths++;
    }

    @Override
    public int compareTo(Tile tile) {
        if (this.distance == -1 && tile.distance > -1) {
            return 1;
        }
        if (this.distance > -1 && tile.distance == -1) {
            return -1;
        }
        return Integer.compare(this.distance, tile.distance);
    }
}
