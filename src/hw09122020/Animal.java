package hw09122020;

public class Animal {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    private static int animalCount;

    static {
        animalCount = 0;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type = " " + name + " успешно пробежала " + dist + " m ");
        } else {
            System.out.println(type + " " + name + " Столько не может ");
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно прыгнул" + height + " m ");
        } else {
            System.out.println(type);
        }
    }

    public  void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            return;
        }
        if ( dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно проплыла " + dist + " m ");
        } else {
            System.out.println(type + " " + name + " столько плыть не может");
        }
    }

    public Animal(String type,String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }
    }
