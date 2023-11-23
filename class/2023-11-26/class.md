# Podatkovne strukture II
Je format za organizacijo, procesiranje in shranjevanje podatkov v računalniku, ki omogoči __učinkovit dostop__ in __spreminjanje__.

## Dvojiško binarno drevo
Stopnja vozlišča največ 2.

### Definicija
Dvojiško drevo je prazno ali pa je sestavljeno iz vozlišča, imenovanega __koren__, in dveh dvojiških dreves, ki se imenujeta __levo poddrevo__ in __desno poddrevo__. Levo in desno poddrevo sta spet dvojiški drvesi.

### Terminologija

**Vozlišča:** Podatek in reference do podreves
**Koren:** Izvorno vozlišče brez starša
**List:** Končno vozlišče brez poddreves

**Starš:** Prvi predhodnik za neko vozlišče
**Potomec:** Koren nekega drevesa
**Predhodnik:** Vsa vozlišlča na najmnajši poti od korena do nekega vozlišča
**Bratje:** Vsa vozlišča z istim staršem
**Berač:** Vsa vozlišča brez podreves

**Stopnja vozlišča:** Število poddreves vozlišča, ki izvira iz nekega vozlišča
**Stopnja drevesa:** Največja stopnja vozlišča v drevesu
**Nivo vozlišča:** Koren ima nivo 1, če oče nekega vozlišča ima nivo n, potem ima to vozlišče n+1

**Poddrevo:** Drevo, ki je poddrevo nekega vozlišča
**Višina drevesa:** Največji nivo vozlišča v drevesu
**Gozd:** Množica disjunktnih dreves
**Pot:** Vozlišča, ki so povezana z neprekinjenimi povezavami

**Urejenost:** Urejenost sinov vozlišča je pomembna