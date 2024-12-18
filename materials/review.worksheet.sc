/*** MAP ***/
// lists
val l1 = List(1,2,3,4)
val l2 = l1.map( i => i + 1 )
l1
l2

l1 map { i => i + 1 }

def increment(x: Int): Int = x + 1

l1.map(increment)
l1 map increment

// maps
val m1 = Map(1 -> "Dog", 2 -> "Cat", 3 -> "Chinchilla")
m1 map { i => "I have a " + i }
m1 map { case (k,v) => (k, "I have a " + v) }
m1 map { i => (i._1, "I have a " + i._2) }

// options
val o1: Option[Int] = Some(10)
val o2: Option[Int] = None

o1 map { i => i + 1 }
o2 map { i => i + 1 }

/*** FLATTEN ***/
val l3 = List(l1, l2)
l3.flatten

/*** FILTER ***/
// lists
l1 filter { i => i%2 == 0 }

// maps
m1 filter { i => i._1%2 == 0 }

/*** FLATMAP ***/
// lists
val l4 = l1 map { i => List(i, i+1)}
l4.flatten
l1 flatMap { i => List(i, i + 1) }

// maps
m1 flatMap { i => List(i._1, i._2)}