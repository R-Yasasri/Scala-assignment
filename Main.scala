object Main extends App {

    var far: Double = celToFar(35.0)
    var vol: Double = volOfSphere(3.0)
    var cost: Double = wholeSaleCost(60)

    println(far)
    println(vol)
    println(cost)

  def celToFar(cell: Double = 35.0): Double = {
    cell * 1.8 + 32

  }

  def volOfSphere(r: Double = 3.0): Double = {
    4.0 / 3.0 * math.Pi * r * r * r
  }

  def wholeSaleCost(num: Int = 60): Double = {
    var discountPercentage: Double = 0.4
    var unitPrice: Double = 24.95
    var discountedPrice: Double = (unitPrice * num) - unitPrice * num * discountPercentage

    var shippingCost: Double = 0.0;

    num match {
      case num if num > 50 => shippingCost = (50 * 3) + (num - 50) * 0.75
      case _ => shippingCost = num * 3
    }

    var totalPrice: Double = discountedPrice + shippingCost

    return totalPrice
  }

}