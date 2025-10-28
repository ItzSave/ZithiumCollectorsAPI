package net.zithium.collectors.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;


public class CollectorAutoSellEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private double totalWorth;
    private long totalAmount;
    private Player player;

    /**
     * Constructs a new CollectorSellAllEvent with the provided information.
     *
     * @param totalWorth  the total worth of all items sold
     * @param totalAmount the total amount of all items sold
     * @param player      the player who initiated the sell action
     *
     * @since api version v1.0.0, plugin version v1.3.0
     */
    public CollectorAutoSellEvent(double totalWorth, long totalAmount, Player player) {
        this.totalWorth = totalWorth;
        this.totalAmount = totalAmount;
        this.player = player;
    }

    /**
     * Gets the total worth of all items sold.
     *
     * @return the total worth of all items sold
     */
    public double getTotalWorth() {
        return totalWorth;
    }

    /**
     * Gets the total amount of all items sold.
     *
     * @return the total amount of all items sold
     */
    public long getTotalAmount() {
        return totalAmount;
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
