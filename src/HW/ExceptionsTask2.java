package HW;


public class ExceptionsTask2 {

    /** Enum for Colors and Types */
    public enum Color {
        Red, Blue, White, Black
    }

    public enum Type {
        I, O, G, A
    }

    /** Class for creating Plant Object */
    public static class Plant {
        private int size;
        private Color color;
        private Type type;
        private int ID=0;
        private static int countPlants = 0;


        /** Constructor for setting Plant properties */
        public Plant(int size, String color, String type) throws ColorException, TypeException {
            this.size = size;
            Color c = colorStrToEnum(color);
            Type t = typeStrToEnum(type);
            this.color = c;
            this.type = t;
            countPlants++;
            this.ID = countPlants;
        }

        /** Method for setting enum color to Object*/
        private Color colorStrToEnum(String color) throws ColorException {
            switch (color.toLowerCase()) {
                case "blue":
                    return Color.Blue;
                case "red":
                    return Color.Red;
                case "white":
                    return Color.White;
                case "black":
                    return Color.Black;
                default:
                    throw new ColorException("Please enter only colors: Red, Blue, White, Black.");
            }
        }

        /** Method for setting enum type to Object*/
        private Type typeStrToEnum(String type) throws TypeException {
            switch (type.toLowerCase()) {
                case "i":
                    return Type.I;
                case "o":
                    return Type.O;
                case "a":
                    return Type.A;
                case "g":
                    return Type.G;
                default:
                    throw new TypeException("Please enter only types: I,O,G,A.");
            }
        }

        /** Overriding toString method*/
        @Override
        public String toString() {
            return "Plant #" + ID + ":" +
                    " size = " + size +
                    ", color = " + color +
                    ", type = " + type;
        }
    }

    /** Class ColorException that have method printing error message*/
    public static class ColorException extends Exception {
        public ColorException(String message) {
            System.err.println (message);
        }
    }

    /** Class TypeException that have method printing error message*/
    public static class TypeException extends Exception {
        public TypeException(String message) {
            System.err.println (message);
        }
    }

    public static void main(String[] args) {

        try {
            Plant[] plants = new Plant[5];
            plants[0] = new Plant(0, "RED", "g");
            System.out.println(plants[0].toString());
            plants[1] = new Plant(1, "RED", "A");
            System.out.println(plants[1].toString());
            plants[2] = new Plant(2, "blUE", "O");
            System.out.println(plants[2].toString());
            plants[3] = new Plant(3, "white", "G");
            System.out.println(plants[3].toString());

            /** plant [4] - for testing errors*/
            plants[4] = new Plant(4, "JAVA", "APPLE");
            System.out.println(plants[4].toString());

        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + ". Please try again.");
            e.printStackTrace();
        }
    }
}
