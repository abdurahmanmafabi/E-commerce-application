package com.example.abdurahman.ecommerseapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abdurahman on 16/07/2018.
 */

public class BusinessAdapter extends  RecyclerView.Adapter<BusinessAdapter.BusinessViewHolder> {


    private List<Business> BusinessList;
    private Context mContext;

    public BusinessListItemClickListener ListItemClickListener;


public BusinessAdapter (Context context){

    this.mContext = context;
}
public interface BusinessListItemClickListener{
    void onItemClick(int itemid);
}

    @Override
    public  BusinessAdapter.BusinessViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.itemsraw,parent,false);
return  new BusinessViewHolder(view);

    }

    @Override
    public void onBindViewHolder(BusinessAdapter.BusinessViewHolder holder, int position) {

            Business business = BusinessList.get(position);
       String name = business.getName();
        String item = business.getItem();
        String comment = business.getComment();
        String amount = business.getAmount();
        String date = business.getDate();

        holder.itemText.setText(name);
        holder.itemText.setText(item);
        holder.itemText.setText(comment);
        holder.itemText.setText(amount);
        holder.itemText.setText(date);

    }

    @Override
    public int getItemCount() {

        if (BusinessList == null) {

            return 0;
        }
        else {
            return BusinessList.size();
        }


    }


    public void setBusiness(List<Business> business){
    BusinessList = business;
    notifyDataSetChanged();
    }
    public class BusinessViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView itemText;
        private TextView commentText;
        private TextView amountText;
        private TextView dateText;

        public BusinessViewHolder(View itemView) {
            super(itemView);
            itemText = itemView.findViewById(R.id.listitem);
            dateText = itemView.findViewById(R.id.listdate);
            commentText = itemView.findViewById(R.id.listcomment);
            amountText = itemView.findViewById(R.id.listamount);

            itemView.setOnClickListener((this));


        }

        @Override
        public void onClick(View view) {
           int itemId = BusinessList.get(getAdapterPosition()).getBusinessId();
            ListItemClickListener.onItemClick(itemId);

        }



    }


    }

