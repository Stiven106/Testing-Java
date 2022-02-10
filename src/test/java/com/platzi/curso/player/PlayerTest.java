package com.platzi.curso.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void looses_when_dice_number_is_too_low() {
        //Dice dice = new Dice(6); <== Esto seria sin mockito

        Dice dice = Mockito.mock(Dice.class); // Esta es la forma de simular una instancia con mockito

        //Con la simulacion de la instancia vamos a ejecutar el metodo roll() y vamos a obligar el resultado con el metodo thenReturn() que nosotros queramos:
        Mockito.when(dice.roll()).thenReturn(2);//En este caso se obliga que el resultado de dice.roll() sea siempre 2.

        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    public void wins_when_dice_number_is_big() {
        Dice dice = Mockito.mock(Dice.class); // simulamos la instancia de tipo Dice.
        Mockito.when(dice.roll()).thenReturn(4);//En este caso se obliga que el resultado de dice.roll() sea siempre 4.
        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }


}