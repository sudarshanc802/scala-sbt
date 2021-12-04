package ScalaTutorial

object CaseClasses extends App {
  abstract class Device
  case class Computer(name: String, monitor: String) extends Device
  case class Mobile(model: String, touchScreen: String) extends Device

  val smartPhone: Mobile = Mobile("KLM", "touchPad")

  def matchCase(device: Device) = {
    device match {
      case Computer(name, monitor) => println(s"We received a computer with name $name and monitor $monitor")
      case Mobile(model, touchScreen) => println(s"We received a mobile with model $model")
    }
  }
  matchCase(smartPhone)

  val newMobile: Mobile = smartPhone.copy()

}

