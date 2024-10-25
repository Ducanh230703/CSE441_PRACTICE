package net.nemisolv.stock_exchange;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ExchangeRateAdapter extends ArrayAdapter<ExchangeRate> {
    private final Context context;
    private final List<ExchangeRate> exchangeRates;

    public ExchangeRateAdapter(Context context, List<ExchangeRate> exchangeRates) {
        super(context, 0, exchangeRates);
        this.context = context;
        this.exchangeRates = exchangeRates;
    }


}