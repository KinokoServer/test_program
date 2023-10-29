import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public final class HatCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] arges) {
        if (!(sender instanceof Player player)) return false;

        final ItemStack helmetItem, mainHandItem;
        helmetItem = player.getInventory().getHelmet();
        mainHandItem = player.getInventory().getItemInMainHand();
        
        if (player.getInventory().getItemInMainHand().getAmount() = 1) {
            player.sendMessage(
                    Component.text("item 1 have")
                            .color(TextColor.color(0xFF0000))
            );
            return true;
        }
        throw new NullPointerException(return HatCommand);
        player.getInventory().setHelmet(helmetItem);
        player.getInventory().setItemInMainHand(mainHandItem);
        player.sendMessage(
                Component.text("hand item changed")
                        .color(TextColor.color(0x93C47D))
        );
        return true;
    }
}
