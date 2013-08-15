import funsets.FunSets._
object test {
 contains(singletonSet(1),1)                      //> res0: Boolean = true
 val setA:Set = x=> x>0;                          //> setA  : Int => Boolean = <function1>
 val setB:Set = x=> x<0;                          //> setB  : Int => Boolean = <function1>
 //printSet(setA);
 val myUnion=union(setA,setB)                     //> myUnion  : Int => Boolean = <function1>
 contains(myUnion,-1)                             //> res1: Boolean = true
 contains(myUnion,1)                              //> res2: Boolean = true
 contains(myUnion,0)                              //> res3: Boolean = false
 val myIntersec=intersect(setA,setB)              //> myIntersec  : Int => Boolean = <function1>
 contains(myIntersec,-1)                          //> res4: Boolean = false
 contains(myIntersec,1)                           //> res5: Boolean = false
 contains(union(myIntersec,singletonSet(0)),0)    //> res6: Boolean = true
 val myDiff=diff(setA,setB)                       //> myDiff  : Int => Boolean = <function1>
 contains(myDiff,1)                               //> res7: Boolean = true
 contains(myDiff,-1)                              //> res8: Boolean = false
 contains(myDiff,0)                               //> res9: Boolean = false
 forall(setA, x => x>0)                           //> res10: Boolean = true
 forall(setA, x => x*x==4)                        //> res11: Boolean = false
 exists(setA, x => x>0)                           //> res12: Boolean = true
 exists(setA, x => x==0)                          //> res13: Boolean = false
 exists(setA, x => x*x==4)                        //> res14: Boolean = true
 val pippo=map(setA, x => -x)                     //> pippo  : Int => Boolean = <function1>
 printSet(pippo)                                  //> {-1000,-999,-998,-997,-996,-995,-994,-993,-992,-991,-990,-989,-988,-987,-986
                                                  //| ,-985,-984,-983,-982,-981,-980,-979,-978,-977,-976,-975,-974,-973,-972,-971,
                                                  //| -970,-969,-968,-967,-966,-965,-964,-963,-962,-961,-960,-959,-958,-957,-956,-
                                                  //| 955,-954,-953,-952,-951,-950,-949,-948,-947,-946,-945,-944,-943,-942,-941,-9
                                                  //| 40,-939,-938,-937,-936,-935,-934,-933,-932,-931,-930,-929,-928,-927,-926,-92
                                                  //| Output exceeds cutoff limit. 
 
 
}