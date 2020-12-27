package move

import input.Input._

object Move {

                  ////////   PARTIE 3 : VARIABLES DE DEPLACEMENT DES TONDEUSES   ////////

  //Création d'un array avec les déplacements des tendeuses
  //Nous avons besoin de séparer les mouvements de tondeuses donc on rajoute :+""
  val deplacementsTondeuses: Array[Array[String]] = Array(mvtTondeuse1:+"" , mvtTondeuse2:+"")

  //Création d'un array avec position initiale des tondeuses sur l'axe x
  val initialPositionX: Array[Int] = Array(initPosT1.charAt(0).asDigit , initPosT2.charAt(0).asDigit)

  //Création d'un array avec position initiale des tondeuses sur l'axe y
  val initialPositionY: Array[Int] = Array(initPosT1.charAt(1).asDigit, initPosT2.charAt(1).asDigit)

  //Création d'un array avec les directions initiales de chaque tondeuse
  val direction: Array[String] = Array(initPosT1.charAt(2).toString , initPosT2.charAt(2).toString)

}
