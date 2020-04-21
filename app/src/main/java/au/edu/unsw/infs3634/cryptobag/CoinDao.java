package au.edu.unsw.infs3634.cryptobag;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import au.edu.unsw.infs3634.cryptobag.Entities.Coin;

@Dao
public interface CoinDao {

    @Query("SELECT * FROM Coin")
            List<Coin> getCoins();

    @Query("SELECT * FROM Coin WHERE id == :coinId")
            Coin getCoin(String coinId);

    @Insert
    void insertAll(Coin... coins);

    @Insert
    void deleteAll(Coin... coins);


}
