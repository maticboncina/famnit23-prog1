# Šesta Ura - OPP Principi

## Uvod

### Abstrackcija
Filtriranje informacij o konceptu, pri čemer izbiramo le vidike, ki so pomembni za določen pomen. 

### Enkapsulacija
Omejevanje dostopa do nekaterih komponent (metod, spremenljivk) objekta, da ohranimo notranje stanje objekta varno pred zunanjim poseganjem in zlorabo. 

### Dedovanje
Omogoča ustvarjanje splošnega razreda, ki opredeluje lastnosti skupne za skupino elemenetov. Iz tega razreda lahko deduje podrazred, ki definira bolj specifične lastnosti. 

### Poliformizem - Večoblišnost
Lastnost, ki omgoča uporabo nekega vmestnika za splošno vrsto delanj. 

Razredni - orveriding

#### Overloading
Dve ali več funckcij z istim imenom, ki se razlikujejo po številu ali tipu vhodnih parametrov.
Java razlikuje katero funckijo kličemo glede na vhodne parametre.


## Dedovanje

Superclass - Superazred
- Definira splošne lastnosti in metode

Subclass - Podrazred
- Deduje lastnosti in metode od superazreda + definira specifične lastnosti in metode

## Superkeyword
- Klicat konstruktor super razreda
- Klicat metode super razreda, ki so bile prekrite v podrazredu. 

## Podpis funkcije

Definira ime in obnašanje funckije
Vrnjen tip
Img
Vhodni parametri

dpouble površina (double h, double w, double d);

## Interface
Interface keyword omogoči popolno abstracija razrednega vmesnika od implementacije razreda

- Ni mogočo instancirati interface-a
- Nima konstruktorja
- Metode v interface-u so običajno abstraktne
- Interface je vedno public
- Razred lahko implementira več interface-ov