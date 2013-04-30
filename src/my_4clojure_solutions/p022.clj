;; http://www.4clojure.com/problem/22

;; Count a Sequence
;; Write a function which returns the total number of elements in a sequence.

;; Special Restrictions:
;; count

;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)

;; Answer:
#(reduce + (map (constantly 1) %))

;; Output:
(= (#(reduce + (map (constantly 1) %)) '(1 2 3 3 1)) 5)
(= (#(reduce + (map (constantly 1) %)) "Hello World") 11)
(= (#(reduce + (map (constantly 1) %)) [[1 2] [3 4] [5 6]]) 3)
(= (#(reduce + (map (constantly 1) %)) '(13)) 1)
(= (#(reduce + (map (constantly 1) %)) '(:a :b :c)) 3)

;; Explanation:
;; I may have cheated on this one. I originally wanted to do a
;; recursive function similar to my solution for Problem 21. However,
;; I'd have to have two arities in the function. One that took just a
;; collection (the initial function call) which then called itself
;; passing the collection and 0 (a counter). Recur removing one
;; element form the collection and increment the counter. Problem with
;; that (one of 'em, at least) is that when the collection becomes
;; nil, the function would be called with a single arg again, which
;; would start the process over. So, no recursing.
;; Then I thought to do reduce. But no matter what I did, I kept
;; coming up with 1. I couldn't get the reduce function to add the 1s.
;; Started looking thru clojuredocs.org at various functions and came
;; across constantly
;; (http://clojuredocs.org/clojure_core/clojure.core/constantly) which
;; has this "really goofy" way of counting the elements in a
;; collection. It was close enough to what I was going for with reduce
;; that I feel OK running with it. Would be interested to see other
;; solutions on this one.

