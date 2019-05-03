package com.B58works.settings.visualmods;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.SwitchPreference;

import com.B58works.R;
import com.B58works.settings.Superpref;

public class grGlobalBG extends Superpref {

    SwitchPreference p;
    Preference p1;
    Preference p2;
    ListPreference p3;

    public grGlobalBG()
    {
        p=(SwitchPreference) findPreference("homebggr");
        p1=findPreference("homebgColor");
        p2=findPreference("homebgColorgr");
        p3=(ListPreference) findPreference("homebgColoror");
    }

    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        addPreferencesFromResource(R.xml.vgrglobalbg);
    }

    protected void onStart()
    {
        super.onStart();
        b58();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s) {
        super.onSharedPreferenceChanged(sharedPreferences, s);
    }

    private void b58()
    {
        p.setTitle(R.string.enablegr);
        p.setSummary(R.string.enablegrsum);
        if(p.isChecked())
        {
            p1.setTitle(R.string.startcolor);
            p1.setSummary(R.string.homebgstartsum);
            p2.setTitle(R.string.endcolor);
            p2.setSummary(R.string.homebgendsum);
            p3.setTitle(R.string.gradient);
            p3.setEntries(R.array.gr_style);
            p3.setEntryValues(R.array.actionbarStyleListValues);
            p3.setDefaultValue("0");
            p3.setSummary(R.string.grstyle);

        }
        else
        {
            p2.setTitle(R.string.disabled);
            p3.setTitle(R.string.disabled);
            p2.setSummary(getApplicationContext().getString(R.string.disableoption,"undef"));
            p3.setSummary(getApplicationContext().getString(R.string.disableoption,"undef"));
            p1.setTitle(R.string.homebg);
            p1.setSummary(R.string.homebgsum);
        }
    }
}
