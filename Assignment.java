
    import java.util.Scanner;
    public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Check voting eligibility
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // 2. Calculate Simple Interest
        System.out.print("\nEnter Principal amount: ");
        float principal = sc.nextFloat();
        System.out.print("Enter Time (years): ");
        float time = sc.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float rate = sc.nextFloat();
        float simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        // 3. Area of triangle, Volume of Cube and Cuboid
        System.out.print("\nEnter base and height of triangle: ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float areaTriangle = (base * height) / 2;
        System.out.println("Area of Triangle: " + areaTriangle);

        System.out.print("Enter side of cube: ");
        float cubeSide = sc.nextFloat();
        float volumeCube = cubeSide * cubeSide * cubeSide;
        System.out.println("Volume of Cube: " + volumeCube);

        System.out.print("Enter length, width and height of cuboid: ");
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        float cuboidHeight = sc.nextFloat();
        float volumeCuboid = length * width * cuboidHeight;
        System.out.println("Volume of Cuboid: " + volumeCuboid);

        // 4. Ternary Operator for voting
        System.out.print("\nEnter age again for ternary check: ");
        int ageTernary = sc.nextInt();
        String result = (ageTernary > 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);

        // 5. Sum and Product of Two Integers
        System.out.print("\nEnter two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Product: " + (num1 * num2));

        // 6. Division of sum and product
        int sum = num1 + num2;
        int product = num1 * num2;
        if (product != 0) {
            float division = (float) sum / product;
            System.out.println("Division of sum and product: " + division);
        } else {
            System.out.println("Product is zero, can't divide.");
        }

        // 7. User Details
        sc.nextLine();  // Consume newline
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        String roll = sc.nextLine();
        System.out.print("Enter your field of interest: ");
        String interest = sc.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + roll +
                ". My field of interest are " + interest + ".");

        // 8. Square and more calculations
        System.out.print("\nEnter side of square: ");
        float squareSide = sc.nextFloat();
        float squareArea = squareSide * squareSide;
        float squarePerimeter = 4 * squareSide;
        System.out.println("Area of square: " + squareArea);
        System.out.println("Perimeter of square: " + squarePerimeter);

        // Also calculating SI, Triangle area, Volume of cube and cuboid again
        System.out.print("Enter Principal, Time, Rate again: ");
        principal = sc.nextFloat();
        time = sc.nextFloat();
        rate = sc.nextFloat();
        simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        System.out.print("Enter base and height for triangle again: ");
        base = sc.nextFloat();
        height = sc.nextFloat();
        areaTriangle = (base * height) / 2;
        System.out.println("Area of Triangle: " + areaTriangle);

        System.out.print("Enter side of cube again: ");
        cubeSide = sc.nextFloat();
        volumeCube = cubeSide * cubeSide * cubeSide;
        System.out.println("Volume of Cube: " + volumeCube);

        System.out.print("Enter length, width, height for cuboid again: ");
        length = sc.nextFloat();
        width = sc.nextFloat();
        cuboidHeight = sc.nextFloat();
        volumeCuboid = length * width * cuboidHeight;
        System.out.println("Volume of Cuboid: " + volumeCuboid);

        // 9. Rectangle area type cast to int
        System.out.print("\nEnter length and breadth of rectangle (double): ");
        double rectLength = sc.nextDouble();
        double rectBreadth = sc.nextDouble();
        double rectArea = rectLength * rectBreadth;
        int areaInt = (int) rectArea;
        System.out.println("Area of Rectangle (int): " + areaInt);

        // 10. Total marks and result classification
        System.out.print("\nEnter marks of 4 subjects: ");
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float m4 = sc.nextFloat();
        float totalMarks = m1 + m2 + m3 + m4;
        float percentage = (totalMarks / 400) * 100;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 70) {
            System.out.println("First Class");
        } else if (percentage > 59) {
            System.out.println("Upper Second Class");
        } else if (percentage > 49) {
            System.out.println("Second Class");
        } else if (percentage > 39) {
            System.out.println("Third Class");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}

    
}
