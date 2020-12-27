package input

import scala.io.StdIn.readLine

object Input {

  ////////  PARTIE 1 : LIMITES DU TERRAIN   ////////

  //Origine du terrain dans le plan (x,y) : (0,0)
  val yMin: Int = 0
  val xMin: Int = 0

  //Dimensions du terrain demandées à l'utilisateur
  println("Entrez la taille du terrain \n ex: 5 5 correspond à 5 pour valeure maximale de x et 5 pour la valeure maximale de y")
  println("Les coordonées x et y doivent être representées par 1 digit. La valeur maximale dans ce cas est 9 pour chaque axe")
  val xyMax : String = readLine().replaceAll(" ","")

  //Création des variables constantes de taille de terrain : valeurs de x et y maximales
  val xMax: Int = xyMax.charAt(0).asDigit
  val yMax: Int = xyMax.charAt(1).asDigit


  ////////  PARTIE 2 : TEST TONDEUSE UTILISATEUR   ////////

  ////Tondeuse 1
  //Demande auprès de l'utilisateur de la position initiale de la tondeuse 1
  println("Entrez la position initiale de la Tondeuse 1 \n ex:1 2 N dont le 1er digit est position sur l'axe x, 2e digit est la position sur l'axe y et 3e caractère est la direction initiale de la tendeuse")
  val initPosT1: String = readLine().toUpperCase().replaceAll(" ","")

  //Demande auprès de l'utilisateur des mouvements de la tondeuse 1
  println("Entrez la séquence de mouvements de la Tendeuse 1 \n ex: GAGAGAGAA comme dans l'exemple test")
  val commandeTondeuse1: String = readLine().toUpperCase()
  val mvtTondeuse1: Array[String] = commandeTondeuse1.split("")  //Creation d'un vecteur des caractères de déplacement


  ////Tondeuse 2
  //Demande auprès de l'utilisateur de la position initiale de la tondeuse 2
  println("Entrez les coordonnées initiales de la Tondeuse 2 \n ex:3 3 E dont le 1er digit est position sur l'axe x, 2e digit est la position sur l'axe y et 3e caractère est la direction initiale de la tendeuse")
  val initPosT2: String = readLine().toUpperCase().replaceAll(" ","")

  //Demande auprès de l'utilisateur d'input des mouvements de la tondeuse 2
  println("Entrez la sequence de mouvements de la Tendeuse 2 \n ex: AADAADADDA comme dans le exemple test")
  val commandeTondeuse2: String = readLine().toUpperCase()
  val mvtTondeuse2: Array[String] = commandeTondeuse2.split("")  //Creation d'un vecteur des caractères de deplacement


  ////Affichage des informations entrées par l'utilisateur

  println("La valeur maximale de l'axe x est "+ xMax + " et la valeur maximale de l'axe y est " + yMax)

  ////Tondeuse 1
  println("La position initiale de la tendeuse 1 est : \n " + initPosT1)
  println("La séquence des mouvements de la tendeuse 1 est : \n " + commandeTondeuse1)

  val mvtT1: String = mvtTondeuse1.mkString(" , ")
  println("Les mouvements de la Tendeuse 1 sont " + mvtT1)

  ////Tondeuse 2
  println("La position initiale de la tendeuse 2 est : \n " + initPosT2)
  println("La séquence des mouvements de la tendeuse 2 est : \n " + commandeTondeuse2)

  val mvtT2: String = mvtTondeuse2.mkString(" , ")
  println("Les mouvements de la Tendeuse 2 sont " + mvtT2)


}
