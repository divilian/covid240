
// Proliferation of classes if you tried to use straight multiple
// inheritance for this:

class Orc extends Combatant {

}

class Fighter extends Combatant {

}

class Wizard extends Combatant {

}

class Armor extends Combatant {

}

class ArmoredOrc extends Orc, Armor {

}

class ArmoredFighter extends Fighter, Armor {

}

class ArmoredWizard extends Wizard, Armor {

}

class ArmoredFireShieldedOrc extends Orc, Armor, FireShield {

}

class ArmoredFireShieldedWizard extends Wizard, Armor, FireShield {

}

...

