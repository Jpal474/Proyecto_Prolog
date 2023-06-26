%Personas
personas(luis).
personas(juan).
personas(pablo).
personas(jose).
personas(maria).
personas(daniela).
personas(paulina).
personas(ana).

%Multimedia
multim(atracadores).
multim(intensamente).
multim(avatar).
multim(codigo_da_vinci).
multim(high_school_musical).
multim(siete_mundos_un_planeta).
multim(bridgerton).
multim(chucky).
multim(outlander).
multim(hwayugi).

%Caracteristicas de la multimedia 
cMultim(atracadores,[accion,crimen,efectos_especiales]).
cMultim(intensamente,[animada,disney,pixar]).
cMultim(avatar,[aventura,ciencia_ficcion,accion,romance]).
cMultim(codigo_da_vinci,[conspiracion,suspenso,accion]).
cMultim(high_school_musical,[musical,romance,drama]).
cMultim(siete_mundos_un_planeta,[documental,concientizacion,ecologista]).
cMultim(bridgerton,[romance,drama,actores_reconocidos]).
cMultim(chucky,[terror,suspenso,efectos_especiales]).
cMultim(outlander,[romance,drama,efectos_especiales]).
cMultim(hwayugi,[comedia,romance,accion]).

%Caracteristicas de las personas
cPersona(luis,[efectos_especiales,aventura,crimen]).
cPersona(juan,[conspiracion,concientizacion,suspenso]).
cPersona(pablo,[terror,suspenso,ciencia_ficcion]).
cPersona(jose,[accion,aventura,ciencia_ficcion]).
cPersona(maria,[romance,drama,comedia]).
cPersona(daniela,[aventura,disney,ciencia_ficcion]).
cPersona(paulina,[animada,ecologia,musical]) .
cPersona(ana,[accion,suspenso,actores_reconocidos]).

%Describimos los valores que tienen las multimedias
vMultim(bridgerton,[desnudos,acciones_de_pareja,historia]).
vMultim(chucky,[tension,misterio,sangriento]).
vMultim(outlander,[desnudos,acciones_de_pareja,viaje_en_tiempo]).
vMultim(hwayugi,[historia,fantasia,corea]).
vMultim(high_school_musical,[moraleja,acciones_de_pareja,aceptacion]).
vMultim(siete_mundos_un_planeta,[consumismo,planeta,moraleja]).
vMultim(atracadores,[ladrones,violencia,crimen]).
vMultim(intensamente,[aceptacion,trabajo_en_equipo,sentimientos]).
vMultim(avatar,[abuso_de_poder,respeto,justicia]).
vMultim(codigo_da_vincio,[conflicto_de_interes,busqueda_de_verdad,teorias]).

%Describimos los gustos de las personas
gPersona(luis,[familiar,corea,moraleja]).
gPersona(juan,[abuso_de_poder,sangriento,justicia]).
gPersona(pablo,[tension,sangriento,teorias]).
gPersona(jose,[sentimientos,trabajo_en_equipo,fantasia]).
gPersona(maria,[moraleja,acciones_de_pareja,fantasia]).
gPersona(daniela,[sentimientos,planeta,aceptacion]).
gPersona(paulina,[familiar,busqueda_de_verdad,moraleja]).
gPersona(ana,[familiar,busqueda_de_verdad,moraleja]).

%Hacemos el match de personas y Multimedia y analizamos los resultados
matchV(P,M):- gPersona(P,GP),vMultim(M,VM), analizarGV(GP,VM).

%Analizamos los gustos de las personas y valores de las Multimedia
analizarGV([H|T],Y) :- member(H, Y) -> true;
analizarGV(T, Y).  
analizarGV([],Y):- !, false.

%Hacemos el match de las caracteristicas de las personas y de las Multimedia y analizamos
matchC(P,M):- cPersona(P,CP),cMultim(M,CM), analizarC(CP,CM).

%Analizamos las caracteristicas de las personas y de las Multimedia
analizarC([H|T],Y) :- member(H, Y) -> true;
analizarC(T, Y).  
analizarC([],Y):- !, false.

%Verificamos que se encuentre en la lista
member(X,[X|_]).
member(X,[_|T]):-member(X,T).

personas(Pedro).
cPersona(Pedro,[terror,aventura,suspenso]).
gPersona(Pedro,[familiar,teorias,moraleja]).

personas(francisco).
cPersona(francisco,[romance,accion,suspenso]).
gPersona(francisco,[familiar,retrospectiva,teorias]).