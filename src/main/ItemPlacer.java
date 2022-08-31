package main;

import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;

public class ItemPlacer {

    GamePanel gamePanel;

    public ItemPlacer(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void setObject() {

        gamePanel.objects[0] = new OBJ_Key();
        gamePanel.objects[0].worldX = 23 * gamePanel.tileSize;
        gamePanel.objects[0].worldY = 7 * gamePanel.tileSize;

        gamePanel.objects[1] = new OBJ_Key();
        gamePanel.objects[1].worldX = 23 * gamePanel.tileSize;
        gamePanel.objects[1].worldY = 40 * gamePanel.tileSize;

        gamePanel.objects[2] = new OBJ_Chest();
        gamePanel.objects[2].worldX = 10 * gamePanel.tileSize;
        gamePanel.objects[2].worldY = 8 * gamePanel.tileSize;

        gamePanel.objects[3] = new OBJ_Door();
        gamePanel.objects[3].worldX = 12 * gamePanel.tileSize;
        gamePanel.objects[3].worldY = 22 * gamePanel.tileSize;

        gamePanel.objects[4] = new OBJ_Door();
        gamePanel.objects[4].worldX = 8 * gamePanel.tileSize;
        gamePanel.objects[4].worldY = 28 * gamePanel.tileSize;

        gamePanel.objects[5] = new OBJ_Door();
        gamePanel.objects[5].worldX = 10 * gamePanel.tileSize;
        gamePanel.objects[5].worldY = 11 * gamePanel.tileSize;
    }
}