package com.xworkz.exampleset.dto;

import java.util.Objects;

public class GiftDto {
    private int id;
    private String name;
    private double cost;
    private String from;
    private String to;

    public GiftDto(int id, String name, double cost, String from, String to) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiftDto giftDto = (GiftDto) o;
        return id == giftDto.id &&
                Double.compare(giftDto.cost, cost) == 0 &&
                Objects.equals(name, giftDto.name) &&
                Objects.equals(from, giftDto.from) &&
                Objects.equals(to, giftDto.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost, from, to);
    }

    @Override
    public String toString() {
        return "GiftDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
