package xpit.top.auction.service;

import org.web3j.crypto.CipherException;
import xpit.top.auction.domain.ResponseResult;
import xpit.top.auction.entity.Bid;
import xpit.top.auction.entity.Product;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * @author Pu Tongjiao
 * @date 2022/9/26 15:55
 */
public interface ContractService {

    void createAccount() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException, CipherException, IOException;

    /**
     * 合约部署
     */
    ResponseResult contractDeploy() throws CipherException, IOException;

    /**
     * 调用合约添加商品
     */
    ResponseResult contractLoadAddProduct(Product product) throws Exception;

    ResponseResult contractLoadGetProduct(long productId) throws Exception;

    ResponseResult bid(Bid bid) throws Exception;

    ResponseResult revealBid(Bid bid) throws Exception;


    ResponseResult highestBidderInfo(long productId) throws Exception;

    ResponseResult totalBids(long productId) throws Exception;

    ResponseResult finalizeAuction(long productId) throws Exception;

}
