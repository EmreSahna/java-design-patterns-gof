package com.emresahna;

public class Home {
    private GardenType garden;
    private int numberOfBedrooms;
    private Color wallColor;
    private Color roofColor;

    private Home(Builder builder) {
        this.garden = builder.garden;
        this.roofColor = builder.roofColor;
        this.wallColor = builder.wallColor;
        this.numberOfBedrooms = builder.numberOfBedrooms;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(garden != null) {
            sb.append("Garden: ").append(garden).append("\t");
        }
        if(numberOfBedrooms > 0) {
            sb.append("Number of bedrooms: ").append(numberOfBedrooms).append("\t");
        }
        if(wallColor != null) {
            sb.append("Wall color: ").append(wallColor).append("\t");
        }
        if(roofColor != null) {
            sb.append("Roof color: ").append(roofColor).append("\t");
        }
        return sb.toString();
    }

    public static class Builder {
        private GardenType garden;
        private int numberOfBedrooms;
        private Color wallColor;
        private Color roofColor;

        public Builder() {
        }

        public Builder gardenType(GardenType garden) {
            this.garden = garden;
            return this;
        }

        public Builder numberOfBedrooms(int numberOfBedrooms) {
            this.numberOfBedrooms = numberOfBedrooms;
            return this;
        }

        public Builder wallColor(Color wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public Builder roofColor(Color roofColor) {
            this.roofColor = roofColor;
            return this;
        }

        public Home build() {
            return new Home(this);
        }
    }
}
