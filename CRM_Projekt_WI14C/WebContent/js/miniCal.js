function Kalender(Monat, Jahr) {
		
		// Für den Abgleich der Monatsnamen
		Monatsname = new Array("Januar", "Februar", "M&aumlrz", "April", "Mai", "Juni",
			"Juli", "August", "September", "Oktober", "November", "Dezember");
		
		// Aktuelles Datum errechnen
		var jetzt = new Date();
		var DieserMonat = jetzt.getMonth() + 1;
		var DiesesJahr = jetzt.getYear() + 1900;
		var DieserTag = jetzt.getDate();
		
		// Ersten Tag des anzuzeigenden Monats errechnen ( Monat - 1, da wir im HTML aufaddiert hatten)
		var Zeit = new Date(Jahr, Monat - 1, 1);
		
		// Tag ermitteln: 
		var Start = Zeit.getDay();
		
		// Sonntag = 0, Montag = 1, Dienstag = 2, usw.
		// für unsere Anischt ist Sonntag als 0 nicht geeignet, daher werden alle Tage eins zurückverlegt -> Montag = 0, usw. und Sonntag wird hinten
		// angestellt als letzter ( 6 ) Tag
		if (Start > 0) {
			Start--;
		} else {
			Start = 6;
		}
		
		// Anzahl der Tage des Monats
		var Stop = 31;
		
		// Außer bei April (4), Juni (6), September (9) und November (11), die nur 30 Tage haben
		if (Monat == 4 || Monat == 6 || Monat == 9 || Monat == 11) --Stop;
		
		// Ebenso der Februar, 
		if (Monat == 2) {
			
			// der nur 28 Tage hat,
			Stop = Stop - 3;
		
			// außer in Schaltjahren
			if (Jahr % 4 == 0) Stop++;
			if (Jahr % 100 == 0) Stop--;
			if (Jahr % 400 == 0) Stop++;
		}
		
		// Ersetzen der Kalenderüberschrift mit dem anzuzeigenden Monat und Jahr
		var Monatskopf = Monatsname[Monat - 1] + " " + Jahr;
		document.getElementById('current_monat').innerHTML = Monatskopf;
		
		// Füllen der Tage mit den einzelnen Tagen von 1 - 31
		var Tage = document.getElementsByClassName('tage');
		for(var i = 1; i <= Stop; i++){
			
			// Einfügen von Leerstellen, falls der 1. nicht ein Montag ist
			if(Start != 1 && i == 1){
				for( var j = 0; j <= ( Start - 1 ) ; j++){
					var li_leer = document.createElement("li");
					li_leer.innerHTML = " ";
					Tage[0].appendChild(li_leer);
				}
			}
			
			// Anfügen der restlichen Tage
			var li_tag = document.createElement("li");
			
			// Aktueller Tag soll als active gekennzeichnet werden, damit er hervorgehoben werden kann.
			if( i == DieserTag && Monat == DieserMonat && Jahr == DiesesJahr ){
				li_tag.setAttribute("class", "active"); 
			}
				
				if( i == 4 || i == 10 || i == 25){
					var p_termin = document.createElement("p");
					p_termin.innerHTML = ".";
					li_tag.innerHTML = i + '<p>.</p>';
				}
				else{
					li_tag.innerHTML = i;
				}
			
			Tage[0].appendChild(li_tag);
			
			
		}
		
		
		
	}