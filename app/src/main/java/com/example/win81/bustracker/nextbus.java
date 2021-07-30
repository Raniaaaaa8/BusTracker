package com.example.win81.bustracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class nextbus extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinnerstop, spinnerdest;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nextbus);

        spinnerstop = (Spinner) findViewById(R.id.spinner2);

        spinnerdest = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter =new ArrayAdapter<String>(nextbus.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.stop_array));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerstop.setAdapter(myAdapter);

        spinnerstop.setOnItemSelectedListener(this);

    }



    @Override

    public void onItemSelected(AdapterView<?> parent, View arg1, int pos,

                               long arg3) {

        parent.getItemAtPosition(pos);

        if (pos==0) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.placeDesMartyrs,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        } else if (pos==1){

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.GrandePoste,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        } else if (pos==2) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.HusseinDey,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        } else if(pos==3) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.LaGlaciere,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==4) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.DIARDJEMAA,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==5) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.Bachdjerrah1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==6) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.DIARDJEMAA1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==7) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.LaGlacière1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==8) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.GRANDEPOSTE1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==9) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.PremierMai,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==10) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.Hamma,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==11) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.OUEDKNIS,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==12) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.VieuxKouba1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==13) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.LaCroix,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==14) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.JardindEssai,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==15) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.LeMoulin,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==16) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.HôtelEsSafir,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==17) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.Bouzareah,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==18) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.Pacale,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==19) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.Bibliothéque,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }else if(pos==20) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.BCItéGaiSoleil,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==21) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.CNR,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==22) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.PremierMai1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==23) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.JardinTunis,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==24) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.Châteauneuf,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==25) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.Chevalley,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==26) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.EcoleMohamedBaaziz,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==27) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.StationAissatIdir,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==28) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.CAROBIERGAREROUTIERE,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==29) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.BabEzzouar,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==30) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.Leshotels1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        } else if(pos==31) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.BabEzzouar1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==32) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.CinqMAISONS1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==33) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.CAROBIERGAREROUTIERE1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==33) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.CAROBIERGAREROUTIERE1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==33) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.CAROBIERGAREROUTIERE1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==34) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.Placedu11Décembre,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        } else if(pos==35) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.MAQUAMECHAHID,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        } else if(pos==36) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.BIRMOURADRAIS,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        } else if(pos==37) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.BIRKHADEM1,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        } else if(pos==38) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.STADEMOHAMEDIGUER,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==39) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.LesJasmins,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }
        else if(pos==40) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.FRERESMADANI,

                            android.R.layout.simple_spinner_item);

            spinnerdest.setAdapter(adapter);

        }







    }



    @Override

    public void onNothingSelected(AdapterView<?> arg0) {

    }
}

