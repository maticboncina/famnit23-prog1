# Čistimo smeti (Ime ure)

## Interface
Inteface ime{
    tip ime ();
}

Interface killer {
    (abstract) boolean kill(String name);
    boolean pension();
}

- Abstraktna je metoda, ki nima telesa. Je metoda, ki jo morem impmentirati, da bom pravilno implčemnitiral razred 

## Abstract class
Mešanica med navadnimi razredi n interfacei

## Dedovanje
Lahko dedujemo samo iz enega stara (razen tranzitivno)

a --> b --> c (ok)

a --> b
a --> c (no ok)

Implementiramo lahko neomejeno število vmesnikov, ne moremo pa extensationirati več kot enega razreda

## Super
je en višji razred
