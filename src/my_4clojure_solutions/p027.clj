;; http://www.4clojure.com/problem/27

;; Palindrome Detector
;; Write a function which returns true if the given sequence is a palindrome.

;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

;; (false? (__ '(1 2 3 4 5)))
;; (true? (__ "racecar"))
;; (true? (__ [:foo :bar :foo]))
;; (true? (__ '(1 1 3 3 1 1)))
;; (false? (__ '(:a :b :c)))

;; Answer:
#(= % (if (string? %) (apply str (reverse %)) (reverse %)))

;; Output:
(false? (#(= % (if (string? %) (apply str (reverse %)) (reverse %))) '(1 2 3 4 5)))
(true? (#(= % (if (string? %) (apply str (reverse %)) (reverse %))) "racecar"))
(true? (#(= % (if (string? %) (apply str (reverse %)) (reverse %))) [:foo :bar :foo]))
(true? (#(= % (if (string? %) (apply str (reverse %)) (reverse %))) '(1 1 3 3 1 1)))
(false? (#(= % (if (string? %) (apply str (reverse %)) (reverse %))) '(:a :b :c)))

;; Explanation:
;; Clearly the issue here revolved around the fact that one simply
;; cannot (reverse "racecar") because the reversed seq contains a
;; series of chars. As hinted above, \r \a \c \e \c \a \r !=
;; "racecar".
;; (apply str (reverse "racecar")) works, but only in that one
;; example. (apply str) is useless on a list or a vector. At least, in
;; this case.
;; I'm not thrilled with the use of the if in the answer, but perhaps
;; that's what they were looking for.

;; I also went a rout of checking the first element against the last
;; element, the second element against the second-to-last element, and
;; so on. I couldn't make that fit concisely or elegantly into an
;; anonymous function, but I thought it might be worth posting here.

#_(defn palindrome?
  ([coll] (palindrome? coll (- (count coll) 1)))
  ([coll n]
     (if (< n 0)
       true
       (if (= (nth coll n) (nth coll (- (count coll) (+ 1 n))))
         (palindrome? coll (- n 1))
         false))))

;; The one big issue I have with this is that it recurses for the
;; entire collection. In reality, it can stop at the halfway point and
;; return true. I didn't want to add yet another conditonal into
;; there, however. Altho I just now realized that with a slight change
;; to the initial condition, it's a pretty easy "fix".

#_(defn palindrome?
  ([coll] (palindrome? coll (- (count coll) 1)))
  ([coll n]
     (if (< n (int (/ (count coll) 2)))
       true
       (if (= (nth coll n) (nth coll (- (count coll) (+ 1 n))))
         (palindrome? coll (- n 1))
         false))))
