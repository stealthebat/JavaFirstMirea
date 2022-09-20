package ru.mirea.task3;

public class Human {

    private Head head;

    private Hand rightHand;
    private Hand leftHand;

    private Leg rightLeg;
    private Leg leftLeg;

    private Human(HumanBuilder builder) {
        this.head = builder.head;
        this.rightHand = builder.rightHand;
        this.leftHand = builder.leftHand;
        this.rightLeg = builder.rightLeg;
        this.leftLeg = builder.leftLeg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ",\n rightHand=" + rightHand +
                ",\n leftHand=" + leftHand +
                ",\n rightLeg=" + rightLeg +
                ",\n leftLeg=" + leftLeg +
                '}';
    }


    static class Leg {
        private int numberOfToes;
        private boolean isHairy;

        public Leg(int numberOfToes, boolean isHairy) {
            this.numberOfToes = numberOfToes;
            this.isHairy = isHairy;
        }

        @Override
        public String toString() {
            return "Leg{" +
                    "numberOfToes=" + numberOfToes +
                    ", isHairy=" + isHairy +
                    '}';
        }

        public int getNumberOfToes() {
            return numberOfToes;
        }

        public void setNumberOfToes(int numberOfToes) {
            this.numberOfToes = numberOfToes;
        }

        public boolean isHairy() {
            return isHairy;
        }

        public void setHairy(boolean hairy) {
            isHairy = hairy;
        }
    }

    static class Hand {
        private int numberOfFingers;
        private double handWidth;

        public Hand(int numberOfFingers, double handWidth) {
            this.numberOfFingers = numberOfFingers;
            this.handWidth = handWidth;
        }

        @Override
        public String toString() {
            return "Hand{" +
                    "numberOfFingers=" + numberOfFingers +
                    ", handWidth=" + handWidth +
                    '}';
        }

        public int getNumberOfFingers() {
            return numberOfFingers;
        }

        public void setNumberOfFingers(int numberOfFingers) {
            this.numberOfFingers = numberOfFingers;
        }

        public double getHandWidth() {
            return handWidth;
        }

        public void setHandWidth(double handWidth) {
            this.handWidth = handWidth;
        }
    }

    static class Head {
        private String hairColor;
        private String eyesColor;

        public String getHairColor() {
            return hairColor;
        }

        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }

        public String getEyesColor() {
            return eyesColor;
        }

        public void setEyesColor(String eyesColor) {
            this.eyesColor = eyesColor;
        }

        public Head(String hairColor, String eyesColor) {
            this.hairColor = hairColor;
            this.eyesColor = eyesColor;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "hairColor='" + hairColor + '\'' +
                    ", eyesColor='" + eyesColor + '\'' +
                    '}';
        }
    }

    public static class HumanBuilder {
        private Head head;

        private Hand rightHand;
        private Hand leftHand;

        private Leg rightLeg;
        private Leg leftLeg;

        public HumanBuilder setHead(String hairColor, String eyesColor) {
            this.head = new Head(hairColor, eyesColor);
            return this;
        }

        public HumanBuilder setRightHand(int numberOfFingers, double handWidth) {
            this.rightHand = new Hand(numberOfFingers, handWidth);
            return this;
        }

        public HumanBuilder setLeftHand(int numberOfFingers, double handWidth) {
            this.leftHand = new Hand(numberOfFingers, handWidth);
            return this;
        }

        public HumanBuilder setRightLeg(int numberOfToes, boolean isHairy) {
            this.rightLeg = new Leg(numberOfToes, isHairy);
            return this;
        }

        public HumanBuilder setLeftLeg(int numberOfToes, boolean isHairy) {
            this.leftLeg = new Leg(numberOfToes, isHairy);
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

}