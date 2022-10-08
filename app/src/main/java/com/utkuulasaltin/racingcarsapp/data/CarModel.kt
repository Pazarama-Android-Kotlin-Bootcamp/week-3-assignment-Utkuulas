package com.utkuulasaltin.racingcarsapp.data

import android.os.Parcelable
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

@Parcelize
data class CarModel(
    val id: String,
    val chassis: String,
    val constructor: String,
    val image: Int,
    val description: String
) : Parcelable {
    fun toJson(): String {
        return Gson().toJson(this)
    }

    companion object {
        fun fromJson(jsonValue: String): CarModel {
            return Gson().fromJson(jsonValue, CarModel::class.java)
        }
    }
}

val mockCarData = mutableListOf<CarModel>(
    CarModel(
        "1",
        "Lotus 72",
        "Lotus-Ford",
        2131165301,
        "The Lotus 72 was a Formula 1 car designed by Maurice Philippe and Colin Chapman for the 1970 Formula 1 season. " +
                "This new model from Lotus came with inboard brakes and side-mounted radiators in the sidepods. " +
                "The Lotus 72 featured a naturally aspirated V8 that could achieve over 440 hp at over 10,000 rpm." +
                "\n" + "\n" +
                "This car set the base for Lotus from 1970 all the way to 1975. " +
                "During this time, Lotus managed to win three Constructors’ Championships and two Drivers’ Championships’. " +
                "This included winning around 20 races and getting on the podium 39 times."
    ),
    CarModel(
        "2",
        "MP4/4",
        "McLaren-Honda",
        2131165320,
        "The McLaren MP4/4 was one of the most successful cars in McLaren’s Formula 1 history. " +
                "Designed in conjunction with Honda’s power unit, the MP4/4 was manufactured with a carbon fiber honeycomb monocoque, double wishbone suspension, and a 6-speed manual transmission." +
                "\n" + "\n" +
                "The McLaren MP4/4 was fitted with a turbocharged V6 engine that managed to produce around 650 to 700 hp at over 12,000 rpm. " +
                "The F1 car was driven by both Alain Prost and Ayrton Senna, with Senna managing to win the 1988 Drivers’ Championship."
    ),
    CarModel(
        "3",
        "FW14/B",
        "Williams-Renault",
        2131165288,
        "The FW14/B was designed and introduced by Williams for the 1992 Formula 1 season. " +
                "The Williams car, driven by Mansell, managed to wrap up the 1992 Drivers’ Championship by winning a record-breaking 9 races during the season." +
                "\n" + "\n" +
                "The Williams was powered by a Renault V10 engine that could easily achieve over 700 hp at 12,000 rpm. " +
                "The car also featured active suspension in the 1992 season, replacing the pushrod, inboard spring suspension of the 1991 model."
    ),
    CarModel(
        "4",
        "B195",
        "Benetton-Renault",
        2131165272,
        "Designed by Formula 1 legend Ross Brawn, the Benetton B195 won the 1995 Formula 1 World Championship. " +
                "Powered by a Renault power unit, the B195 featured a V10 engine that could produce over 675 hp at over 15,000 rpm." +
                "\n" + "\n" +
                "The B195 was famous due to it powering Michael Schumacher to his first-ever Drivers’ World Championship title in 1995. " +
                "The impressive race car won 11 of its 17 races, with 4 pole positions and 8 fastest lap awards as well."
    ),
    CarModel(
        "5",
        "F2002",
        "Ferrari",
        2131165287,
        "One of the most successful and famous Formula 1 cars in recent history has to be the F2002 from Ferrari. " +
                "The Ferrari F2002 was designed and manufactured by Scuderia Ferrari Marlboro for the 2002 season of the Formula 1 World Championship. " +
                "Taking over from the F2001, the Ferrari F2002 implemented a naturally aspirated 3-liter V10 in conjunction with a new 7-speed automatic gearbox." +
                "\n" + "\n" +
                "This powertrain managed to produce 835 hp at over 17,000 rpm. This model managed 15 race wins, 28 podiums, 11 pole positions, and 15 fastest lap awards during the 2002 and 2003 seasons. " +
                "With this, Ferrari managed to secure both the Drivers’ and Constructors’ Championships during this time as well."
    ),
    CarModel(
        "6",
        "BGP 001",
        "Brawn-Mercedes",
        2131165273,
        "Brawn is one of the most unique and successful teams in Formula 1 history. " +
                "This is due to the fact that Brawn managed to master the new regulations in 2009 to win both the Constructors’ and Drivers’ Championships in their first and only season in Formula 1." +
                "\n" + "\n" +
                "The Brawn BGP 001 included a wishbone and pushrod activated suspension, with a Mercedes-Benz 2.4-liter, naturally aspirated V8. " +
                "The 750 hp engine was designed for a number of cars on the grid that year, but was made effective with Brawn’s dynamic aerodynamic package. " +
                "This helped Jenson Button to his only Drivers’ Championship and the team to their first and only Constructors’ Championship title."
    ),
    CarModel(
        "7",
        "RB9",
        "Red Bull-Renault",
        2131165344,
        "Red Bull does not sell cars. They sell energy drinks. " +
                "However, the RB9 is by far one of the most memorable and iconic Formula 1 cars in recent history. " +
                "Manufactured for the 2013 Formula 1 season, the RB9 was designed with a Renault power unit that produced over 750 hp." +
                "\n" + "\n" +
                "Although Red Bull was on a winning streak, the 2013 Formula 1 season was highly contested as a development battle between some of the top teams. " +
                "Finishing 1st and 6th in the opening race, Red Bull had a lot of work to do in the second half of the season. " +
                "This helped Vettel win 9 straight Grand Prix to secure his 4th World Championship in a row."
    ),
    CarModel(
        "8",
        "W11",
        "Mercedes",
        2131165349,
        "While the Mercedes-Benz F1 team had been dominating F1 at the time, the Mercedes W11 took it to a whole new level. " +
                "This was due to the perfecting of the turbo-hybrid power unit along with dynamic, new motorsport technologies developed specifically for the 2020 season." +
                "\n" + "\n" +
                "Although controversial, Mercedes developed a dual axis steering system (DAS) for the 2020 F1 season. " +
                "This lets the driver push and pull the steering wheel to change the angle of the front wheels. " +
                "The change in angle allowed for more grip in certain parts of the track and resulted in a seriously dominant performance in the 2020 season. " +
                "This led Lewis Hamilton to his record-equaling, 7th World Drivers’ Championship as the W11 managed to win 13 of the 17 races."
    )
)
