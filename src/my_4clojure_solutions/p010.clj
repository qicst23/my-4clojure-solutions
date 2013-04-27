;; http://www.4clojure.com/problem/10

;; Sets: Intro to Maps
;; Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.

;; (= ___ ((hash-map :a 10, :b 20, :c 30) :b))
;; (= ___ (:b {:a 10, :b 20, :c 30}))

;; Answer:
;; 20

;; Output:
(= 20 ((hash-map :a 10 :b 20 :c 30) :b))
(= 20 (:b {:a 10 :b 20 :c 30}))

;; Explanation:
;; In the first problem, a hash-map is created with the hash-map
;; function. {:a 10 :b 20 :c 30}. The keyword :b is then used as a
;; lookup function, which returns the value 20.
;; In the second problem, :b is also used as a lookup to retrieve a
;; value from the existing hashmap {:a 10, :b 20, :c 30}.
;; Worth noting that the lookup can be done either with the keyword
;; first or with the map first.
