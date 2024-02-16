package net.zithium.collectors.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * An event that is triggered when a player sells items collected by a collector.
 * This event provides information about the total worth and total amount of items sold,
 * as well as the player who initiated the sell action.
 *
 * @since 1.3.0
 */
public class CollectorSellEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private double totalWorth;
    private int totalAmount;
    private Player player;

    /**
     * Constructs a new CollectorSellEvent with the provided information.
     *
     * @param totalWorth  the total worth of the items sold
     * @param totalAmount the total amount of the items sold
     * @param player      the player who initiated the sell action
     */
    public CollectorSellEvent(double totalWorth, int totalAmount, Player player) {
        this.totalWorth = totalWorth;
        this.totalAmount = totalAmount;
        this.player = player;
    }

    /**
     * Gets the total worth of the items sold.
     *
     * @return the total worth of the items sold
     */
    public double getTotalWorth() {
        return totalWorth;
    }

    /**
     * Sets the total worth of all items sold.
     *
     * @param totalWorth the total worth of all items sold
     */
    public void setTotalWorth(double totalWorth) {
        this.totalWorth = totalWorth;
    }


    /**
     * Gets the total amount of the items sold.
     *
     * @return the total amount of the items sold
     */
    public int getTotalAmount() {
        return totalAmount;
    }

    /**
     * Gets the player who initiated the sell action.
     *
     * @return the player who initiated the sell action
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the HandlerList for this event.
     *
     * @return the HandlerList for this event
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Gets the HandlerList for this event.
     *
     * @return the HandlerList for this event
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }
}