package run

import input.Input._
import move.Move._

object Run extends App {


                  ////////   PARTIE 4 : BOUCLE DE DEPLACEMENT DES TONDEUSES   ////////

  //Numéro de tondeuse
  //A chaque étape d'iteration de la boucle, cette variable va representer le numero de la tendeuse en cours de mouvement
  var tondeuseNo = 1

  //Ensuite nous calculons dans la boucle la position finale de chaque tondeuse
  for (tondeuseNo <- 1 to 2) {

    //Nous prenons la position initiale de chaque tondeuse à partir des valeurs de position initiale sur les axes x et y
    var x = initialPositionX(tondeuseNo-1)
    var y = initialPositionY(tondeuseNo-1)

    //Création des variables de renouvelement de la position de la tondeuse à chaque étape
    var directionTondeuse: String = direction(tondeuseNo-1)

    //Création des mouvements
    val mouvementTondeuse = deplacementsTondeuses(tondeuseNo - 1)
    var mouvementTondeuseBis: String = mouvementTondeuse(1)


    //Détérmination de la nouvelle position et direction à chaque étape
    def renouvellementPosition() {

      //Dans le cas d'un virage à droite
      if (mouvementTondeuseBis == "D") {
        if (directionTondeuse == "S") {directionTondeuse = "W"}
        else if (directionTondeuse == "N") {directionTondeuse = "E"}
        else if (directionTondeuse == "W") {directionTondeuse = "N"}
        else if (directionTondeuse == "E") {directionTondeuse = "S"}
        else {directionTondeuse = "n'existe pas"}
      }

      //Dans le cas d'un virage à gauche
      else if (mouvementTondeuseBis == "G") {
        if (directionTondeuse == "S") {directionTondeuse = "E"}
        else if (directionTondeuse == "N") {directionTondeuse = "W"}
        else if (directionTondeuse == "W") {directionTondeuse = "S"}
        else if (directionTondeuse == "E") {directionTondeuse = "N"}
        else {directionTondeuse = "n'existe pas"}
      }

      //Limitation par les bornes min et max du terrain pour ne pas continuer le déplacement hors terrain
      else if (mouvementTondeuseBis == "A" & y <= yMax & x <= xMax & y >= yMin & x >= xMin) {
        if (directionTondeuse == "S" & y > yMin) {y = y-1}
        else if (directionTondeuse == "N" & y < yMax) {y = y+1}
        else if (directionTondeuse == "W" & x > xMin) {x = x-1}
        else if (directionTondeuse == "E" & x < xMax) {x = x+1}
        else {println("La tondeuse est hors du terrain")} //la tondeuse reste à sa position actuelle x,y
      }

      else {println(s"$x $y $directionTondeuse")}

    }

    //Affichage des positions finales des tondeuses selon la séquence de mouvements G, D ou A
    //La séquence de mouvements défile à chaque itération de la fonction renouvellementPosition() pour chaque "mvt" ici
    //Boucle imbriquée pour afficher le résultat pour nos deux tondeuses
    println(s"La position finale de la tondeuse $tondeuseNo est :")
    for (mvt <- mouvementTondeuse) {
      mouvementTondeuseBis = mvt
      renouvellementPosition()
    }
  }


}
