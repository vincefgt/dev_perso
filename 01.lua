// ex n°1
program
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

N02 -----------------------------------------------------------------
X : [integer]
function writeEntier2( : integer)
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
writeEntier2()
end
-----------------------------------------------------------------
start
    While X = lireEntier() do
        resultat = resultat * X
        X := X + 1
    end while
writeEntier2()
end
-----------------------------------------------------------------
start
    for X = 1 to lireEntier()
        do
            resultat = resultat * X
            X := X + 1
        end do    
    end for       
writeEntier2()
end

N03 ---------------------------------------------------------------------------
function lireEntier3 (a : integer, b : integer, c : integer)
    return lireEntier(a,b,c)
end function

x : integer

