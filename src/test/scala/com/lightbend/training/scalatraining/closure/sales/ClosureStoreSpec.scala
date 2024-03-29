package com.lightbend.training.scalatraining.closure.sales

import com.lightbend.training.scalatraining.functions.closure.sales.{ClosureStore, Jean, ProductSale, TShirt}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ClosureStoreSpec extends AnyFlatSpec with should.Matchers {

  val products: List[ProductSale] = List(new Jean(100), new TShirt(50))

  "ClosureStore" should
    "calculate all budget with ClosureStore without sales" in {
      val closureStore: ClosureStore = new ClosureStore()
      closureStore.basketPrice(products) shouldBe 150
    }

  "ClosureStore" should "calculate all budget with ClosureStore 10 percent discount and max 15 percent discount" in {
      val closureStore: ClosureStore = new ClosureStore(10, 15)
      closureStore.basketPrice(products) shouldBe 135
    }

  "ClosureStore" should "calculate all budget with ClosureStore 20 percent discount and max 10 percent discount" in {
      val closureStore: ClosureStore = new ClosureStore(20, 10)
      closureStore.basketPrice(products) shouldBe 135
    }
}
