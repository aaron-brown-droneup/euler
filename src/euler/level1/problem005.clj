(ns euler.level1.problem005)

(defn greatest-common-divisor [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn least-common-multiple [a b]
  (/ (* a b) (greatest-common-divisor a b)))

(defn euler-5 [end]
  (reduce least-common-multiple (range 1 (inc end))))


;
;(defn prime? [n]
;  (->> (for [x (range 2 (- n 1))]
;         (rem n x))
;       (filter #(= 0 %))
;       empty?))
;
;(defn get-next-prime [n]
;  (cond
;    (prime? (inc n)) (inc n)
;    :else (get-next-prime (inc n))))
;
;(defn get-prime-factors-using-divisor [n div]
;  (cond
;    (>= div n) [n]
;    (= 0 (rem n div)) (cons div (get-prime-factors-using-divisor (/ n div) div))
;    :else (get-prime-factors-using-divisor n (get-next-prime div))))
;
;
;(defn get-prime-factors [n]
;  (get-prime-factors-using-divisor n 2))
;
;(defn get-prime-factors-with-powers [n]
;  (map (fn [[k v]] [k v]) (vec (frequencies (get-prime-factors n)))))
;
;(defn get-prime-factors-up-to [cur max]
;  (cond (> cur max) []
;        :else (vec (cons (get-prime-factors-with-powers cur) (get-prime-factors-up-to (inc cur) max)))
;        ))
;
;(defn get-highest-power-for-each [numbers-with-powers]
;  (map (fn [prime-factors-with-powers-for-number]
;         (println prime-factors-with-powers-for-number)
;         (map (fn [[val occurrences]]
;                [val (apply max (map second occurrences))])
;              (group-by first prime-factors-with-powers-for-number))
;         ) numbers-with-powers)
;  )
;
;(defn power-of [num exponent]
;  (reduce * (repeat num exponent))
;  )
;
;
;(defn apply-powers [sets]
;  (map (fn [[num power]] (power-of num power)) sets)
;  )
;
;(defn euler-5 [max]
;  (get-highest-power-for-each (get-prime-factors-up-to 1 max))
;  )