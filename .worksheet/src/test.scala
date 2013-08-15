import funsets.FunSets._
object test {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); val res$0 = 
 contains(singletonSet(1),1);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(25); 
 val setA:Set = x=> x>0;System.out.println("""setA  : Int => Boolean = """ + $show(setA ));$skip(25); ;
 val setB:Set = x=> x<0;System.out.println("""setB  : Int => Boolean = """ + $show(setB ));$skip(49); ;
 //printSet(setA);
 val myUnion=union(setA,setB);System.out.println("""myUnion  : Int => Boolean = """ + $show(myUnion ));$skip(22); val res$1 = 
 contains(myUnion,-1);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(21); val res$2 = 
 contains(myUnion,1);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(21); val res$3 = 
 contains(myUnion,0);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(37); 
 val myIntersec=intersect(setA,setB);System.out.println("""myIntersec  : Int => Boolean = """ + $show(myIntersec ));$skip(25); val res$4 = 
 contains(myIntersec,-1);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(24); val res$5 = 
 contains(myIntersec,1);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(47); val res$6 = 
 contains(union(myIntersec,singletonSet(0)),0);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(28); 
 val myDiff=diff(setA,setB);System.out.println("""myDiff  : Int => Boolean = """ + $show(myDiff ));$skip(20); val res$7 = 
 contains(myDiff,1);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(21); val res$8 = 
 contains(myDiff,-1);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(20); val res$9 = 
 contains(myDiff,0);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(24); val res$10 = 
 forall(setA, x => x>0);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(27); val res$11 = 
 forall(setA, x => x*x==4);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(24); val res$12 = 
 exists(setA, x => x>0);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(25); val res$13 = 
 exists(setA, x => x==0);System.out.println("""res13: Boolean = """ + $show(res$13));$skip(27); val res$14 = 
 exists(setA, x => x*x==4);System.out.println("""res14: Boolean = """ + $show(res$14));$skip(30); 
 val pippo=map(setA, x => -x);System.out.println("""pippo  : Int => Boolean = """ + $show(pippo ));$skip(17); 
 printSet(pippo)}
 
 
}