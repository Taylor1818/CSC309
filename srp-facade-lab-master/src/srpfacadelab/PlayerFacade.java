package srpfacadelab;

public class PlayerFacade {
    InventoryManager inventory;
    Health health;
    Action action;

    public PlayerFacade(RpgPlayer player) {
        inventory = new InventoryManager(player);
        health = new Health(player, inventory);
        action = new Action(player, inventory);
    }

    public void useItem(Item item) {
        action.useItem(item);
    }

    public void pickupItem(Item item) {
        action.pickUpItem(item);
    }

    public void takeDamage(int damage) {
        health.takeDamage(damage);
    }

    public void calculateStats() {
        inventory.calculateStats();
    }

    public void checkIfItemExistsInInventory(Item item) {
        inventory.checkIfItemExistsInInventory(item);
    }

    public int calculateInventoryWeight() {
        return inventory.calculateInventoryWeight();
    }

}