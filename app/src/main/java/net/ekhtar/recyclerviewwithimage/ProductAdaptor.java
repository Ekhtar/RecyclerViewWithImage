package net.ekhtar.recyclerviewwithimage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mino on 18/10/2017.
 */

public class ProductAdaptor extends RecyclerView.Adapter<ProductAdaptor.ProductViewHolder> {
    private List<Product> productList;

    public ProductAdaptor(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item,parent,false));
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product product=productList.get(position);
        holder.name.setText(product.getName());
        holder.price.setText(product.getPrice());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        private TextView name, price,brand;
        private ImageView image ,like;
        private RatingBar rating;
        public ProductViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.textView3);
            price=itemView.findViewById(R.id.textView10);
        }
    }
}
