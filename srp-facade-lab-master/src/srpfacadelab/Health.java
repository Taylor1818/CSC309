package srpfacadelab;

public class Health {
    RpgPlayer player;
    InventoryManager inventory;

    public Health(RpgPlayer player, InventoryManager inventory) {
        this.player = player;
        this.inventory = inventory;
    }

    public void takeDamage(int damage) {
        if (damage < player.getArmour()) {
            player.gameEngine.playSpecialEffect("parry");
        }

        if (inventory.calculateInventoryWeight() < 0.5 * player.getCarryingCapacity())
            damage -= damage * 0.25;

        int damageToDeal = damage - player.getArmour();
        player.setHealth(player.getHealth() - damageToDeal);

        player.gameEngine.playSpecialEffect("lots_of_gore");
    }
}