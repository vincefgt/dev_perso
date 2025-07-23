# ex n°1
//program
N : [integer] = 0;
resultat : [integer] = 0;

// user's reading
function lireEntier( : [integer]) 
    if lireEntier <> 0 then
        return lireEntier()
    end if

// écrire le resultat
function writeEntier (:[integer])
     write("Le résultat avec tantique est :",resultat)
end function

N01----------------------------------------------------------------------------
start
    if N <= lireEntier() then
        resultat = resultat + 1
        N := N + 1
    end if
writeEntier()
end
-----------------------------------------------------------------
start
N = 0 
    While N = lireEntier() do
        resultat = resultat + 1
        N := N + 1
    end while
writeEntier()
end
-----------------------------------------------------------------
start
    for N = 0 to lireEntier()
        do
            resultat = resultat + 1;
            N := N + 1;   
    end for       
writeEntier()
end
## N02 - Ex 3.2 -----------------------------------------------------------------
X : [integer]
function writeEntier2( x: integer, resultat : integer)
    write("La factorielle de ", X, "avec tantique est :", resultat)
end function

start
resultat := X
    if lireEntier > 0 AND X <= lireEntier then
        resultat = resultat * X
        X := X + 1
    else
        resultat = 1
    end if 
writeEntier2(x,resultat)
end
-----------------------------------------------------------------
start
    While X = lireEntier(x) do
        resultat = resultat * X
        X := X + 1
    end while
writeEntier2(x,resultat)
end
-----------------------------------------------------------------
start
    for X = 1 to lireEntier(x)
        do
            resultat = resultat * X
            X := X + 1
        end do    
    end for       
writeEntier2(x,resultat)
end

### N03 ---------------------------------------------------------------------------

function lireEntier3 (a : integer, b : integer, c : integer)
    return lireEntier(a,b,c)
end function

x : integer
discri : integer

start
read(lireEntier)
    if discri <> 0 then
        x = (-b)/(2*a)
    else if discri < 0 then
            x = (-b + racine(-1*discri))/(2*a), " et ", (-b - racine(-1*discri))/(2*a),
        else
            x = (-b + racine(discri))/(2*a), " et ", (-b - racine(discri))/(2*a),
        end if
    end if
write(x)
end

#### N04 ----------------------------------------
indice : integer = 1
resultat : integer
function lireEntier(x:integer, y:intger)
    read(x)
    read(y)
    return(x,y)
end function

start
lireEntier(x,y)
resultat = x
do 
    resultat = resultat * x
    indice = indice +1
while indice = y
write(resultat)
end

##### N05 -------------------------------------------
X : integer
type tabEntiers :  array[TAILLE_MAX]
TAILLE_MAX : integer = 10
tab[rang] : integer
ranginit : integer
rangrefsup : integer
rangrefinf : inetger
TAILLE_MAXvirtuel : integer

//definir nomnbre entier
function entier(ranginit)
        if ((refinit - rangref) / 2) mod 2 <> 0 then
            rang = ((refinit - rangref) + 1 / 2)
        else
            rang = ((refinit - rangref) / 2)
        end if
    return rang
end function

//rechercher valeur
function rechercherEntier (tab, X)
    ranginit = TAILLE_MAX / 2
   

    if ranginit mod 2 <> 0 then
        TAILLE_MAXvirtuel = TAILLE_MAX + 1
        ranginit = TAILLE_MAXvirtuel / 2
    end if

    if X = tab[ranginit] then
        return ranginit
    else
        if X < tab[ranginit] then
            rangref = ranginit
            entier(ranginit)
            rang = refinit - refcible
            refinit = rang
        else
            entier(refentier)
            rang = refinit + refcible
            refinit = rang
        end if
    end if
end function

start
while x = tab[rang] OR rang = -1
    rechercherEntier(tab,x)
end while
write(rang)







####### N01.2

taille : integer
indice : integer

function array[taille]

start

//remplir le tableau
do
array[indice] = Number
indice = indice + 1
while indice == taille

// afficher le tableau
return array[]

//affiche la valeur max
for indice from 0 to TAILLE Do
    if array[indice] > valeurmax then
        valeurmax := array[indice]
        indice := indice + 1
    end if
end for

// AFFICHAGE vMAX
return valeurmax

end for

######### N02.2
calculemoyenne : integer
for


######### 
saisi : integer
pass : integer = 1

function read
    saisi := integer
end function

function writeerror()
    write "Saisir un nombre positif"
end fucntion 

function pair
    if saisi mod 2 then
        write "pair"
    end if
end function

start
read()
for pass from 0 to 4 do
    //si positif
    if saisi > 0 then
    else
    writeerror()
    end if

    // si pair
    pair()

    //validation verif > lancement verif suivante
    pass := pass + 1
end for


// SENSEO
// faire un cafe
tempO : integer = 50
dosette : boolean
O : boolean = false
tO : integer = 0
resistance : boolean = false
pompe : boolean = false
temppompe : integer = 5
chrono : integer

function temperation de l'eau(O)
    read temperation
        if O = true then
            resistance = true
            do 
                lire(tO)
            while tO = tempO
    return temperation de l'eau = true
end function
    
function dosette installer(dosette)
    read dosette
    return dosette
end function

start

if temperature de l'eau = true and dosette instaler = true then
    pompe = true
    chrono = 0
    while chrono = temppompe do
    chrono = chrono + 1
    end while
end if
end


// POTATOES
x : integer
VPANIER : integer = 3

fucntion read()
    x := read
end fucntion

start
// connaitre les nombres de pomme de terre
read()
// calculer le nombre d'AR en prendre ne compter si ce un multiple de VPANIER ou non
if x mod VPANIER == 0 then
    result = x / VPANIER
    else
    result = ( x / VPANIER ) + 1
end if

write result
end

######## algo 4.1
nb : integer = 9
rang : integer
som : integer

//catch user's note
som = 0
    for rang from 0 to nb - 1
        read(note)
        array[rang] = note
        som = som + note
        rang = rang + 1
    end for

// calcule moy
moy = som/nb
write("la moyenne est ",moy)

########## algo 4.2
rangtotal : integer
type tab : array[rangtotal]
rang : integer
key : integer
temp : integer
rangtri : integer

begin
// 4.2.1 insertion sort
for rang from 1 to rangtotal - 1
    key = tab[rang]
    rangtri := rang
    while key <= tab[rangtri - 1] or rangtri >= 0 do
        temp = tab[rangtri - 1]
        tab[rangtri] = temp
        tab[rangtri-1] = key
        rangtri = rangtri - 1
    end while
end for

// 4.2.2 bubbles sort
rang = 0
//key >> flag >> key : boolean
key = true
    while key = true do
        key = false
            for rang from 0 to rangtotal - 1
                if array[rang + 1] < array[rang] then
                    temp = array[rang + 1]
                    array[rang + 1] = array[rang]
                    array[rang] = temp
                    key = true
                end if
            end for
    end while

// 4.3 dico
type tab : array[rangtotal]
rangtotal : integer
x : integer

begin
read(x)
do 
    rang  = 0
    if x <> tab[rang] then
        rang = rang + 1
    end if
while x = tab[rang]

// 4.4
y : integer = 8
x : integer = 12
type tab : array[x][y]
xtemp : integer
ytemp : integer
valref : integer = 0
temp : integer

// recherhche sur colonne
function rechercheline(xtemp,ytemp)
        for xtemp from 0 to x -1 do 
            if tab[xtemp][ytemp] > temp then
                temp := tab[xtemp][ytemp]
            end if
        end for 
end function

begin
// recherche sur ligne
for ytemp from 0 to y - 1
    xtemp = 0
    rechercheline(xtemp,ytemp)
end for
write("value max = ",temp)
end

// 5.1
N : integer
type tab : array[N]
x : integer
counter : integer = 0
rang : integer
valrang : integer
tabBis : array[N]

begin
read(x)
    counter := 0
    for rang from 0 to N - 1 
        if x := tab[rang] then
            counter := counter + 1 
        end if
    end for
    write(counter)
end for
end

//5.2
for valrang from 0 to N - 1
    x := tab[valrang]
    // donnée la valeur de 0 dans le tableau d'occurence sauf si une valuer diff de 0 existe ou sans valeur
    if tabBis[valrang] <> 0 or tabBis <> "" then
    else
        tabBis[valrang] := 0
    end if

    // init counter à  0
    counter := 0

    for rang from 0 to N - 1 
        if x := tab[rang] then
            counter := counter + 1 
        end if
    end for
write(counter)

// depot comptage dans tableau d'occurrence
tabBis[x] := counter 
end for

end

// 6
x : integer = 3
y : integer
type disq : array[x][y]

disqp : integer = 3
disqm : integer = 2


function disqsup
    if disq[x][y] < disq[x][y-1] then
        disq


begin
read(y)
// 1 deplacement

disq[][] 
if disq[][] 