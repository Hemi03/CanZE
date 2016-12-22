/*
    CanZE
    Take a closer look at your ZE car

    Copyright (C) 2015 - The CanZE Team
    http://canze.fisch.lu

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or any
    later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package lu.fisch.canze.actors;

/**
 * Created by jeroen on 4-12-16.
 */

public class EcuDiagCLUSTER {

    // static final public String fieldsString () {
    void load () {

        String fieldDef = // ID (hex), startBit, endBit, resolution, offset (aplied BEFORE resolution multiplication), decimals, unit, requestID (hex string), responseID (hex string),
                // options (hex, see MainActivity for definitions), optional name, optional list
                ""

                        +"764,24,55,1,0,0,Km,220206,620206,ff,Config Entretien_Odometre general\n" //
                        +"764,24,39,1,0,0,km,220202,620202,ff,Config Entretien_Vidange courant. distance\n" //
                        +"764,40,55,1,0,0,Jours,220202,620202,ff,Config Entretien_Vidange courant. Jours\n" //
                        +"764,24,39,1,0,0,km,220201,620201,ff,Config Entretien_Vidange init.Valeur initiale autonomie vidange distance\n" //
                        +"764,40,55,1,0,0,Jours,220201,620201,ff,Config Entretien_Vidange init.Valeur initiale autonomie vidange temps\n" //
                        +"764,24,55,1,0,0,m,222101,622101,ff,Infos Calcul_Distance parcourue ADAC\n" //
                        +"764,24,47,1,0,0,s,222104,622104,ff,Infos Calcul_Temps ADAC\n" //
                        +"764,38,38,1,0,0,,222407,622407,ff,Status Systeme_erreur configuration.Erreur Configuration SSPP,0:Pas d'erreur config SSPP;1:Erreur config SSPP\n" //
                        +"764,35,35,1,0,0,,222407,622407,ff,Status Systeme_erreur configuration.Erreur Configuration tableau jamais configure,0:Pas d'erreur : tdb configuré OK;1:Erreur : Tdb jamais configuré\n" //
                        +"764,30,30,1,0,0,,222407,622407,ff,Status Systeme_erreur configuration.Erreur Configuration UPA,0:Pas d'erreur config UPA;1:Erreur config UPA\n" //
                        +"764,29,29,1,0,0,,222407,622407,ff,Status Systeme_erreur configuration.Erreur Configuration TCU,0:Pas d'erreur config TCU;1:Erreur config TCU\n" //
                        +"764,28,28,1,0,0,,222407,622407,ff,Status Systeme_erreur configuration.Erreur Configuration CLIM,0:Pas d'erreur config CLIM;1:Erreur config CLIM\n" //
                        +"764,24,31,1,0,0,,222406,622406,ff,Status Systeme_number intended resets\n" //
                        +"764,24,31,1,0,0,,222405,622405,ff,Status Systeme_number resets by failures\n" //
                        +"764,24,31,1,0,0,,222403,622403,ff,Status Systeme_status EEPROM,0:Non défini;1:EEPROM Status OK;2:EEPROM Error\n" //
                        +"764,16,23,1,0,0,,2181,6181,ff,VIN Numero Identification\n" //
                        +"764,16,23,1,0,0,,2100,6100,ff,Reponse LID utilises\n" //
                        +"764,24,31,1,0,0,,220127,620127,ff,Config Generale_VehicleIdent default value\n" //
                        +"764,24,31,1,0,0,,220122,620122,ff,Config Generale_Affichage temp exter,0:sans affichage température ext;16:Avec affichage température extérieure (par défaut)\n" //
                        +"764,24,31,1,0,0,,220101,620101,ff,Config Generale_Langue,0:Francais (par défaut);16:Anglais;32:Italien;48:Allemand;64:Espagnol;80:Hollandais;96:Portugais;112:Turc;128:Polonais;145:Suedois;146:Finnois;147:Bulgare;148:Slovene;149:Grec;150:Roumain;151:Hongrois;152:Slovaque;153:Tcheque;154:Danois;155:Estonien;156:Letton;157:Lituanien;158:Croate;255:Autre\n" //
                        +"764,24,31,1,0,0,,22010F,62010F,ff,Config Generale_Survitesse,0:Sans  survitesse (par défaut);16:Avec survitesse\n" //
                        +"764,24,31,1,0,0,,220111,620111,ff,Config Generale_ALS,0:Sans ALS (par défaut);16:Avec ALS\n" //
                        +"764,24,31,1,0,0,,220207,620207,ff,Config Entretien_Nb de maj par diag\n" //
                        +"764,40,41,1,0,0,,2182,6182,ff,Module BusMuet,0:Non muet;2:BusMuet;3:Confirmé BusMuet\n" //
                        +"764,42,47,1,0,0,,2182,6182,ff,Module BusMuet compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,32,33,1,0,0,,2182,6182,ff,Module BusOff,0:BusOn;2:BusOff;3:Confirmé BusOff\n" //
                        +"764,34,39,1,0,0,,2182,6182,ff,Module BusOff compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,56,57,1,0,0,,2182,6182,ff,Producteur MUX BRAKE,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,58,63,1,0,0,,2182,6182,ff,Producteur MUX BRAKE compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,80,81,1,0,0,,2182,6182,ff,Producteur MUX Airbag,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,82,87,1,0,0,,2182,6182,ff,Producteur MUX Airbag compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,184,185,1,0,0,,2182,6182,ff,Producteur MUX EPS Controle trajectoire,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,186,191,1,0,0,,2182,6182,ff,Producteur MUX EPS Controle trajectoire compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,64,65,1,0,0,,2182,6182,ff,Producteur MUX Tabbeau de bord,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,66,71,1,0,0,,2182,6182,ff,Producteur MUX Tabbeau de bord compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,72,73,1,0,0,,2182,6182,ff,Producteur MUX BCM,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,74,79,1,0,0,,2182,6182,ff,Producteur MUX BCM compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,200,201,1,0,0,,2182,6182,ff,Producteur MUX USM,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,202,207,1,0,0,,2182,6182,ff,Producteur MUX USM compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,16,23,1,0,0,,2182,6182,ff,Version Messagerie Mux\n" //
                        +"764,672,673,1,0,0,,2182,6182,ff,Producteur MUX TCU,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,674,679,1,0,0,,2182,6182,ff,Producteur MUX TCU compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,664,665,1,0,0,,2182,6182,ff,Producteur MUX UBP,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,666,671,1,0,0,,2182,6182,ff,Producteur MUX UBP compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,424,425,1,0,0,,2182,6182,ff,Producteur MUX EVC,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,426,431,1,0,0,,2182,6182,ff,Producteur MUX EVC compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,104,105,1,0,0,,2182,6182,ff,Producteur MUX Clim,0:Présent;2:Absent;3:Confirmé Absent\n" //
                        +"764,106,111,1,0,0,,2182,6182,ff,Producteur MUX Clim compteur,0:0;1:1;2:2;3:3;4:4;5:5;6:6;7:7;8:8;9:9;10:10;11:11;12:12;13:13;14:14;15:15;16:16;17:17;18:18;19:19;20:20;21:21;22:22;23:23;24:24;25:25;26:26;27:27;28:28;29:29;30:30;31:31;32:32;33:33;34:34;35:35;36:36;37:37;38:38;39:39;40:40;63:Non Contrôlé\n" //
                        +"764,16,23,1,0,0,,21B4,61B4,ff,RECVAL2\n" //
                        +"764,16,23,1,0,0,,21B3,61B3,ff,RECVAL1\n" //
                        +"764,160,167,1,0,0,,2180,6180,ff,CalibrationNumber\n" //
                        +"764,56,63,1,0,0,,2180,6180,ff,DiagnosticIdentificationCode\n" //
                        +"764,128,135,1,0,0,,2180,6180,ff,SoftwareNumber\n" //
                        +"764,64,71,1,0,0,,2180,6180,ff,SupplierNumber.ITG\n" //
                        +"764,144,151,1,0,0,,2180,6180,ff,EditionNumber\n" //
                        +"764,176,183,1,0,0,,2180,6180,ff,PartNumber.BasicPartList,0:N/A;2:285J2\n" //
                        +"764,184,191,1,0,0,,2180,6180,ff,HardwareNumber.BasicPartList,0:N/A;1:25046\n" //
                        +"764,192,199,1,0,0,,2180,6180,ff,ApprovalNumber.BasicPartList,0:N/A\n" //
                        +"764,16,23,1,0,0,,2180,6180,ff,PartNumber.LowerPart\n" //
                        +"764,88,95,1,0,0,,2180,6180,ff,HardwareNumber.LowerPart\n" //
                        +"764,200,207,1,0,0,,2180,6180,ff,ManufacturerIdentificationCode,0:Renault R1;128:Nissan N1;129:Nissan N2;130:Nissan N3;136:Magnéti Marelli\n" //
                        +"764,24,31,1,0,0,,222505,622505,ff,Causes allumage temoins Ref.REF Present Alerte 1\n" //
                        +"764,40,47,1,0,0,,222505,622505,ff,Causes allumage temoins Ref.REF Present Alerte 2\n" //
                        +"764,24,31,1,0,0,,222503,622503,ff,Causes allumage temoins Stop.STOP Present Alerte 1\n" //
                        +"764,40,47,1,0,0,,222503,622503,ff,Causes allumage temoins Stop.STOP Present Alerte 2\n" //
                        +"764,24,31,1,0,0,,222007,622007,ff,Entrees filaires_contact siege chauffant,1:0 siège chauffant actif (témoin éteint);2:1 siège chauffant activé (témoin allumé);4:2 sièges chauffants activés (témoin allumé)\n" //
                        +"764,24,31,1,0,0,,222501,622501,ff,Causes allumage temoins Service Present.SERVICE Present Alerte 1\n" //
                        +"764,40,47,1,0,0,,222501,622501,ff,Causes allumage temoins Service Present.SERVICE Present Alerte 2\n" //
                        +"764,38,38,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.left\n" //
                        +"764,39,39,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.right\n" //
                        +"764,41,41,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Rep since reset\n" //
                        +"764,42,42,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Val since reset\n" //
                        +"764,43,43,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Vol plus since reset\n" //
                        +"764,44,44,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Vol moins since reset\n" //
                        +"764,45,45,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Sup since reset\n" //
                        +"764,46,46,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.High since reset\n" //
                        +"764,47,47,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Low since reset\n" //
                        +"764,55,55,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.right since reset\n" //
                        +"764,54,54,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.left since reset\n" //
                        +"764,25,25,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Rep\n" //
                        +"764,26,26,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Val\n" //
                        +"764,27,27,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Vol plus\n" //
                        +"764,28,28,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Vol moins\n" //
                        +"764,29,29,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Sup\n" //
                        +"764,30,30,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.High\n" //
                        +"764,31,31,1,0,0,,2220F0,6220F0,ff,Entrees filaires_Satellite_boutons.Low\n" //
                        +"764,24,39,1,0,0,Jours,222602,622602,ff,DataRead Info Entretien Jours apres alerte\n" //
                        +"764,24,39,1,0,0,km,222601,622601,ff,DataRead Info Entretien Km apres alerte\n" //
                        +"764,24,39,1,0,0,km,222603,622603,ff,DataRead Info Entretien valeur affichee\n" //
                        +"764,24,31,1,0,0,,222502,622502,ff,Causes allumage temoins Service Memorise.SERVICE Memorise Alerte 1\n" //
                        +"764,40,47,1,0,0,,222502,622502,ff,Causes allumage temoins Service Memorise.SERVICE Memorise Alerte 2\n" //
                        +"764,24,31,1,0,0,,222504,622504,ff,Causes allumage temoin Stop Memorise.STOP Memorise Alerte 1\n" //
                        +"764,40,47,1,0,0,,222504,622504,ff,Causes allumage temoin Stop Memorise.STOP Memorise Alerte 2\n" //
                        +"764,24,31,1,0,0,,222506,622506,ff,Causes allumage temoin Ref Memorise.REF Memorise Alerte 1\n" //
                        +"764,40,47,1,0,0,,222506,622506,ff,Causes allumage temoin Ref Memorise.REF Memorise Alerte 2\n" //
                        +"764,24,39,1,0,0,V,222006,622006,ff,Entrees filaires_batterie\n" //
                        +"764,24,24,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette bas since reset\n" //
                        +"764,25,25,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette haut since reset\n" //
                        +"764,26,26,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette A since reset\n" //
                        +"764,27,27,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette B since reset\n" //
                        +"764,28,28,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette C since reset\n" //
                        +"764,32,32,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette bas\n" //
                        +"764,33,33,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette haut\n" //
                        +"764,34,34,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette A\n" //
                        +"764,35,35,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette B\n" //
                        +"764,36,36,1,0,0,,2220F1,6220F1,ff,Entrees filaires_Satellite_rotary.Molette C\n" //
                        +"764,26,26,1,0,0,,2220F2,6220F2,ff,Entrees filaires_Wake up Signals.system ON Request\n" //
                        +"764,28,28,1,0,0,,2220F2,6220F2,ff,Entrees filaires_Wake up Signals.Wake up\n" //
                        +"764,31,31,1,0,0,,2220F3,6220F3,ff,Entrees filaires_Output Lines.System On,1:System ON (ON command from MM= 1 if active)\n" //
                        +"764,24,31,1,0,0,,220108,620108,ff,Config Generale_RV_LV_ACC,0:Sans (par défaut);16:RV / LV présent;32:ACC / LV;48:LV seul\n" //
                        +"764,16,23,1,0,0,,2184,6184,ff,ClusterProductionNumber en ASCII\n" //
                        +"764,96,103,1,0,0,,2184,6184,ff,ClusterProductionDate en ASCII\n" //
                        +"764,24,31,1,0,0,,22F196,62F196,ff,Numero homologation reference\n" //
                        +"764,24,31,1,0,0,,22F18E,62F18E,ff,Reference piece VehicleManufacturer KitAssemblyPartNumber\n" //
                        +"764,24,31,1,0,0,,22F187,62F187,ff,Reference piece VehicleManufacturer SparePartNumber\n" //
                        +"764,24,31,1,0,0,,220110,620110,ff,Config Generale_TCU,0:Sans TCU (par défaut);16:Avec TCU\n" //
                        +"764,24,31,1,0,0,,22010C,62010C,ff,Config Generale_Clim,0:Sans Clim (par défaut);16:Avec Clim\n" //
                        +"764,24,31,1,0,0,,22011C,62011C,ff,Config Generale_menu_retardateur,0:Sans Menu_Retardateur  (par défaut);16:Avec Menu_Retardateur\n" //
                        +"764,29,29,1,0,0,,22200B,62200B,ff,Entrees filaires_Input_boutons.Bouton Push to Talk\n" //
                        +"764,30,30,1,0,0,,22200B,62200B,ff,Entrees filaires_Input_boutons.Bouton Input LVE arriere\n" //
                        +"764,31,31,1,0,0,,22200B,62200B,ff,Entrees filaires_Input_boutons.Bouton Ambiance\n" //
                        +"764,25,25,1,0,0,,22200B,62200B,ff,Entrees filaires_Input_boutons.Push toTalk press since reset\n" //
                        +"764,27,27,1,0,0,,22200B,62200B,ff,Entrees filaires_Input_boutons.Bouton Ambiance press since reset\n" //
                        +"764,26,26,1,0,0,,22200B,62200B,ff,Entrees filaires_Input_boutons. Bouton LVE arriere press since reset\n" //
                        +"764,24,31,1,40,0,°C,222202,622202,ff,Mesures CTN_afficheur.Temperature Dalle\n" //
                        +"764,24,31,1,40,0,°C,222204,622204,ff,Mesures Temperature Exterieure.Temperature Exterieure\n" //
                        +"764,24,31,1,0,0,,220208,620208,ff,Config Entretien_Nb de maj par ABS\n" //
                        +"764,24,31,1,0,0,,22010D,62010D,ff,Config Generale_AAP UPA,0:Sans AAP (par défaut);16:Avec APP AV et AR;32:Avec APP AR uniquement\n" //
                        +"764,24,31,1,0,0,,220121,620121,ff,Config Generale_montre,0:sans affichage montre ( par défaut);16:montre 12 heures;32:montre 24 heures\n" //
                        +"764,24,31,1,0,0,,220119,620119,ff,Config Generale_Essuyage automatique,0:Sans CFG MPU Ess lunette marche arr (par défaut);16:Avec CFG MPU Essuyage lunette marche arriere\n" //
                        +"764,24,31,1,0,0,,220109,620109,ff,Config Generale_Inhib SBR_av,0:Buzzer SBR avant non inhibé (par défaut);16:Buzzer SBR avant inhibe\n" //
                        +"764,24,31,1,0,0,,220129,620129,ff,Config Generale_NAV,0:sans NAV (par defaut);16:MFD présent\n" //
                        +"764,24,31,1,0,0,,22010E,62010E,ff,Config Generale_SSPP TPMS,0:Sans SSPP (par défaut);16:Avec SSPP et sans stratégie de reset;32:Avec SSPP et avec stratégie de reset\n" //
                        +"764,24,31,1,0,0,,220104,620104,ff,Config Generale_Distance,0:Km (par défaut);16:Miles\n" //
                        +"764,24,31,1,0,0,,220107,620107,ff,Config Generale_pression,0:BAR (par défaut);16:PSI\n" //
                        +"764,24,47,1,0,0,Km,222605,622605,ff,DataRead Odo TdB avant recalage TdB par ABS\n" //
                        +"764,24,47,1,0,0,Km,222604,622604,ff,DataRead Odo TdB avant recalage ABS par TdB\n" //
                        +"764,24,31,1,0,0,,222001,622001,ff,Entrees filaires_contact frein a main,0:Frein desserré (contact ouvert);1:Frein serré (contact fermé)\n" //
                        +"764,24,39,1,0,0,mV,222002,622002,ff,Entrees filaires_incident frein NivoCod.Tension Nivocod\n" //
                        +"764,40,47,1,0,0,,222002,622002,ff,Entrees filaires_incident frein NivoCod.Entree Nivocod,0:Pas de défaut;1:Défaut Nivocod;2:Entrée en CC;3:Entrée en CO\n" //
                        +"764,24,31,1,0,0,,220116,620116,ff,Config Generale_Sons clignotants personalise,0:Not tuned (default value);16:Tuned\n" //
                        +"764,24,31,1,0,0,,220102,620102,ff,Config Generale_Sieges chauffants,0:Sans Sièges Chauffants;16:Avec Sièges Chauffants\n" //
                ;

        Frames.getInstance().load ("763,0,0,CLUSTER\n");
        Fields.getInstance().load (fieldDef);
    }
}
