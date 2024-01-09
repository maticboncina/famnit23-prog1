void kvadrat(int a) {
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < a; j++) {
            System.out.print(j + 1 + " "); // Print numbers in the same line with a space
        }
        System.out.println(); // Move to the next line after completing each row
    }
}
