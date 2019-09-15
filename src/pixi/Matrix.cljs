(ns pixi.Matrix
  "The PixiJS Matrix as a class makes it a lot faster.
  Here is a representation of it:
  ```js
  | a | c | tx|
  | b | d | ty|
  | 0 | 0 | 1 |
  ```"
  (:refer-clojure :exclude [identity apply clone set to-array]))

(defn new
  "Constructor."
  ([]
    (new js/Matrix))
  ([a]
    (new js/Matrix a))
  ([a b]
    (new js/Matrix a b))
  ([a b c]
    (new js/Matrix a b c))
  ([a b c d]
    (new js/Matrix a b c d))
  ([a b c d tx]
    (new js/Matrix a b c d tx))
  ([a b c d tx ty]
    (new js/Matrix a b c d tx ty)))

(defn append
  "Method.

  Member of Matrix.

  Appends the given Matrix to this Matrix."
  ([this matrix]
    (-> this (.append matrix))))

(defn apply
  "Method.

  Member of Matrix.

  Get a new position with the current transformation applied.
  Can be used to go from a child's coordinate space to the world
  space. (e.g. rendering)"
  ([this pos]
    (-> this (.apply pos)))
  ([this pos new-pos]
    (-> this (.apply pos new-pos))))

(defn apply-inverse
  "Method.

  Member of Matrix.

  Get a new position with the inverse of the current transformation
  Can be used to go from the world coordinate space to a child's
  space. (e.g. input)"
  ([this pos]
    (-> this (.applyInverse pos)))
  ([this pos new-pos]
    (-> this (.applyInverse pos new-pos))))

(defn clone
  "Method.

  Member of Matrix.

  Creates a new Matrix object with the same values as this one."
  ([this]
    (-> this (.clone))))

(defn copy-from
  "Method.

  Member of Matrix.

  Changes the values of the matrix to be the same as the ones in
  matrix"
  ([this matrix]
    (-> this (.copyFrom matrix))))

(defn copy-to
  "Method.

  Member of Matrix.

  Changes the values of the given matrix to be the same as the
  in this matrix"
  ([this matrix]
    (-> this (.copyTo matrix))))

(defn decompose
  "Method.

  Member of Matrix.

  Decomposes the matrix (x, y, scaleX, scaleY, and rotation) and
  the properties on to a transform."
  ([this transform]
    (-> this (.decompose transform))))

(defn from-array
  "Method.

  Member of Matrix.

  Creates a Matrix object based on the given array. The Element
  Matrix mapping order is as follows:
  a = array[0]
  b = array[1]
  c = array[3]
  d = array[4]
  tx = array[2]
  ty = array[5]"
  ([this array]
    (-> this (.fromArray array))))

(defn identity
  "Method.

  Member of Matrix.

  Resets this Matrix to an identity (default) matrix."
  ([this]
    (-> this (.identity))))

(defn invert
  "Method.

  Member of Matrix.

  Inverts this matrix"
  ([this]
    (-> this (.invert))))

(defn prepend
  "Method.

  Member of Matrix.

  Prepends the given Matrix to this Matrix."
  ([this matrix]
    (-> this (.prepend matrix))))

(defn rotate
  "Method.

  Member of Matrix.

  Applies a rotation transformation to the matrix."
  ([this angle]
    (-> this (.rotate angle))))

(defn scale
  "Method.

  Member of Matrix.

  Applies a scale transformation to the matrix."
  ([this x y]
    (-> this (.scale x y))))

(defn set
  "Method.

  Member of Matrix.

  sets the matrix properties"
  ([this a b c d tx ty]
    (-> this (.set a b c d tx ty))))

(defn set-transform
  "Method.

  Member of Matrix.

  Sets the matrix based on all the available properties"
  ([this x y pivot-x pivot-y scale-x scale-y rotation skew-x skew-y]
    (-> this (.setTransform x y pivot-x pivot-y scale-x scale-y rotation skew-x skew-y))))

(defn to-array
  "Method.

  Member of Matrix.

  Creates an array from the current Matrix object."
  ([this transpose]
    (-> this (.toArray transpose)))
  ([this transpose out]
    (-> this (.toArray transpose out))))

(defn translate
  "Method.

  Member of Matrix.

  Translates the matrix on the x and y."
  ([this x y]
    (-> this (.translate x y))))

(defn identity
  "Property.

  Member of Matrix.

  A default (identity) matrix"
  []
  (-> js/Matrix .-IDENTITY))

(defn set-identity!
  "Property.

  Member of Matrix.

  A default (identity) matrix"
  [val]
  (aset js/Matrix "IDENTITY" val))

(defn temp-matrix
  "Property.

  Member of Matrix.

  A temp matrix"
  []
  (-> js/Matrix .-TEMP_MATRIX))

(defn set-temp-matrix!
  "Property.

  Member of Matrix.

  A temp matrix"
  [val]
  (aset js/Matrix "TEMP_MATRIX" val))

(defn a
  "Property.

  Member of Matrix."
  [this]
  (-> this .-a))

(defn set-a!
  "Property.

  Member of Matrix."
  [this val]
  (aset this "a" val))

(defn b
  "Property.

  Member of Matrix."
  [this]
  (-> this .-b))

(defn set-b!
  "Property.

  Member of Matrix."
  [this val]
  (aset this "b" val))

(defn c
  "Property.

  Member of Matrix."
  [this]
  (-> this .-c))

(defn set-c!
  "Property.

  Member of Matrix."
  [this val]
  (aset this "c" val))

(defn d
  "Property.

  Member of Matrix."
  [this]
  (-> this .-d))

(defn set-d!
  "Property.

  Member of Matrix."
  [this val]
  (aset this "d" val))

(defn tx
  "Property.

  Member of Matrix."
  [this]
  (-> this .-tx))

(defn set-tx!
  "Property.

  Member of Matrix."
  [this val]
  (aset this "tx" val))

(defn ty
  "Property.

  Member of Matrix."
  [this]
  (-> this .-ty))

(defn set-ty!
  "Property.

  Member of Matrix."
  [this val]
  (aset this "ty" val))

