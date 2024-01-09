int prestej(String beseda) {
    int stevec = 0;
    for (int i = 0; i < beseda.length(); i++) {
        if (beseda.charAt(i) == 'a' || beseda.charAt(i) == 'e' || beseda.charAt(i) == 'i' || beseda.charAt(i) == 'o' || beseda.charAt(i) == 'u') {
            // Do nothing for vowels
        } else {
            stevec++; // Increment counter for consonants
        }
    }
    return stevec;
}
